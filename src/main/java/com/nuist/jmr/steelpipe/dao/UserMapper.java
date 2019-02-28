package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.User;
import com.nuist.jmr.steelpipe.entity.UserExample;
import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}