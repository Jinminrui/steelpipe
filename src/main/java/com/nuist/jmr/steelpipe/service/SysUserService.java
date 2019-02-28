package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.entity.SysUser;

import java.util.List;

public interface SysUserService {
    int addSysUser(SysUser sysUser);
    List<SysUser> findAllSysUser(int pageNum, int pageSize);
    int deleteSysUser(int pk);
    boolean login(String username, String password);
    List<SysUser> findByName(String username);
}
