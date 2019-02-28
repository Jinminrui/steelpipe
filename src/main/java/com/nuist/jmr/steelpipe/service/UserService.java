package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.entity.User;

import java.util.List;

public interface UserService {
    int addUser(User user);
    List<User> findAllUser(int pageNum, int pageSize);
    int deletUser(int pk);
    int updateUser(User user);
    User findById (int pk);
    boolean login(String username, String password);
}
