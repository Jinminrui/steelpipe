package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.SysUser;
import com.nuist.jmr.steelpipe.entity.SysUserExample;
import java.util.List;

public interface SysUserMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    List<SysUser> selectByExample(SysUserExample example);

    SysUser selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);
}