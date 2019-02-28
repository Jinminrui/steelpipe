package com.nuist.jmr.steelpipe.controller;

import com.nuist.jmr.steelpipe.entity.SysUser;
import com.nuist.jmr.steelpipe.entity.User;
import com.nuist.jmr.steelpipe.service.UserService;
import com.nuist.jmr.steelpipe.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/user")
@CrossOrigin(value = "*", maxAge = 3600)
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(value = "add")
    public Map<String, Object> addUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        int result = userService.addUser(user);
        if (result == 1) {
            map.put("code", "10000");
            map.put("message", "添加用户成功");
        } else if (result == 2) {
            map.put("code", "20000");
            map.put("message", "此用户名已存在");
        } else if (result == 0) {
            map.put("code", "00000");
            map.put("message", "添加用户失败");
        }
        return map;
    }

    @RequestMapping(value = "/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllSysUser(@PathVariable("pageNum") int pageNum,
                                              @PathVariable("pageSize") int pageSize) {
        Map<String, Object> map = new HashMap<>();
        try {
            List<User> userList = userService.findAllUser(pageNum, pageSize);
            map.put("code", "10000");
            map.put("message","查询成功！");
            map.put("count", userList.size());
            map.put("userList", userList);
            return map;
        } catch (Exception e){
            map.put("code","00000");
            map.put("message","出错了！");
            return map;
        }
    }

    @PostMapping(value = "/delete")
    public Map<String, Object> deleteUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        int result = userService.deletUser(user.getPkId());
        if (result == 1){
            map.put("code","10000");
            map.put("message", "删除用户成功");
        } else {
            map.put("code","00000");
            map.put("message", "删除用户失败");
        }
        return map;
    }

    @PostMapping(value = "/update")
    public Map<String, Object> updateUser(@RequestBody User user) {
        Map<String, Object> map = new HashMap<>();
        int result = userService.updateUser(user);
        if (result == 1){
            map.put("code","10000");
            map.put("message", "更新用户成功");
        } else {
            map.put("code","00000");
            map.put("message", "更新用户失败");
        }
        return map;
    }

    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestBody SysUser sysUser){
        Map<String, Object> map = new HashMap<>();
        String username = sysUser.getUsername();
        String password = sysUser.getPassword();
        if (userService.login(username, password)){
            String token = TokenUtil.sign(username,password);
            if (token != null){
                map.put("code", "10000");
                map.put("message","认证成功");
                map.put("token", token);
                return map;
            }
        }
        map.put("code", "00000");
        map.put("message","认证失败");
        return map;
    }

}
