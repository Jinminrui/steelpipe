package com.nuist.jmr.steelpipe.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.exceptions.JWTDecodeException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.nuist.jmr.steelpipe.entity.SysUser;
import com.nuist.jmr.steelpipe.service.SysUserService;
import com.nuist.jmr.steelpipe.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/sysUser")
@CrossOrigin(value = "*", maxAge = 3600)
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Map<String, Object> addSysUser(@RequestBody SysUser sysUser) {
        Map<String, Object> map = new HashMap<>();
        int result = sysUserService.addSysUser(sysUser);
        if(result == 1){
            map.put("code","10000");
            map.put("message", "添加系统管理员成功");
        } else if (result == 2){
            map.put("code","20000");
            map.put("message", "系统管理员用户名已存在");
        } else if (result == 0){
            map.put("code","00000");
            map.put("message", "添加系统管理员失败");
        }
        return map;
    }

    @RequestMapping(value = "/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllSysUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize) {
        Map<String, Object> map = new HashMap<>();
        List<SysUser> sysUserList = sysUserService.findAllSysUser(pageNum, pageSize);
        map.put("code","10000");
        map.put("message","查询成功");
        map.put("sysUserList", sysUserList);
        map.put("count", sysUserList.size());
        return map;
    }

    @PostMapping(value = "/delete")
    public Map<String, Object> deleteSysUser(@RequestBody SysUser sysUser) {
        Map<String, Object> map = new HashMap<>();
        int result = sysUserService.deleteSysUser(sysUser.getPkId());
        if (result == 1){
            map.put("code","10000");
            map.put("message", "删除系统管理员成功");
        } else {
            map.put("code","00000");
            map.put("message", "删除系统管理员失败");
        }
        return map;
    }

    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestBody SysUser sysUser){
        Map<String, Object> map = new HashMap<>();
        String username = sysUser.getUsername();
        String password = sysUser.getPassword();
        if (sysUserService.login(username, password)){
            String token = TokenUtil.sign(username,password);
            if (token != null){
                map.put("code", "10000");
                map.put("message","登陆成功");
                map.put("token", token);
                return map;
            }
        }
        map.put("code", "00000");
        map.put("message","登陆失败，账号或密码不正确");
        return map;
    }

    @PostMapping(value = "/logout")
    public Map<String, Object> logout(){
        Map<String, Object> map = new HashMap<>();
        map.put("code", "10000");
        return map;
    }

    @GetMapping(value = "/getInfo")
    public Map<String, Object> getInfoByToken(@RequestParam(value = "token") String token){
        Map<String, Object> map = new HashMap<>();
        List<String> roles = new ArrayList<>();
        roles.add("admin");
        String username = getUserName(token);
        map.put("code", "10000");
        map.put("message","获取成功");
        map.put("name", username);
        map.put("roles",roles);
        return map;
    }

    /**
     * 从token中获取username信息
     * @param token
     * @return
     */
    public static String getUserName(String token){
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("loginName").asString();
        } catch (JWTDecodeException e){
            e.printStackTrace();
            return null;
        }
    }
}
