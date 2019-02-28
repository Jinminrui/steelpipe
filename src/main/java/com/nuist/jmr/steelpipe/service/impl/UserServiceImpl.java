package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.UserMapper;
import com.nuist.jmr.steelpipe.entity.User;
import com.nuist.jmr.steelpipe.entity.UserExample;
import com.nuist.jmr.steelpipe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional()
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user) {
        int result = 0;
        try {
            UserExample userExample = new UserExample();
            userExample.or().andUsernameEqualTo(user.getUsername());
            List<User> userList = userMapper.selectByExample(userExample);
            if (userList.size() != 0) {
                result = 2;
            } else {
                user.setGmtCreate(new Date());
                userMapper.insertSelective(user);
                result = 1;
            }
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return result;
        }
    }

    @Override
    public List<User> findAllUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        return userMapper.selectByExample(userExample);
    }

    @Override
    public int deletUser(int pk) {
        try {
            userMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateUser(User user) {
        try {
            user.setGmtModified(new Date());
            userMapper.updateByPrimaryKeySelective(user);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public User findById(int pk) {
        return userMapper.selectByPrimaryKey(pk);
    }

    @Override
    public boolean login(String username, String password) {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        userExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList.size() != 0){
            return true;
        }
        return false;
    }
}
