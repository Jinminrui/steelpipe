package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.SysUserMapper;
import com.nuist.jmr.steelpipe.entity.SysUser;
import com.nuist.jmr.steelpipe.entity.SysUserExample;
import com.nuist.jmr.steelpipe.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional()
@Service(value = "sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public int addSysUser(SysUser sysUser) {
        int result = 0;
        try {
            SysUserExample sysUserExample = new SysUserExample();
            sysUserExample.or().andUsernameEqualTo(sysUser.getUsername());
            List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
            if (sysUserList.size() != 0) {
                result = 2;
            } else {
                sysUserMapper.insertSelective(sysUser);
                result = 1;
            }
            return result;
        } catch (Exception e) {
            return result;
        }

    }

    @Override
    public List<SysUser> findAllSysUser(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria sysUserExampleCriteria = sysUserExample.createCriteria();
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        return sysUserList;
    }

    @Override
    public int deleteSysUser(int pk) {
        try {
            sysUserMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e) {
            return 0;
        }
    }

    @Override
    public boolean login(String username, String password) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        sysUserExample.or().andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<SysUser> sysUserList = sysUserMapper.selectByExample(sysUserExample);
        if (sysUserList.size() != 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<SysUser> findByName(String username) {
        SysUserExample sysUserExample = new SysUserExample();
        SysUserExample.Criteria criteria = sysUserExample.createCriteria();
        sysUserExample.or().andUsernameEqualTo(username);
        return sysUserMapper.selectByExample(sysUserExample);
    }

}
