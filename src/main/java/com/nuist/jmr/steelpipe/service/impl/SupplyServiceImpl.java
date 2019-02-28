package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.SupplyInfoMapper;
import com.nuist.jmr.steelpipe.dto.SupplyDetail;
import com.nuist.jmr.steelpipe.entity.SupplyInfo;
import com.nuist.jmr.steelpipe.entity.SupplyInfoExample;
import com.nuist.jmr.steelpipe.service.ProductTypeService;
import com.nuist.jmr.steelpipe.service.SupplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional()
@Service(value = "supplyService")
public class SupplyServiceImpl implements SupplyService {
    @Autowired
    SupplyInfoMapper supplyInfoMapper;

    @Override
    public List<SupplyInfo> findAllSupplyInfo(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        SupplyInfoExample supplyInfoExample = new SupplyInfoExample();
        return supplyInfoMapper.selectByExample(supplyInfoExample);
    }

    @Override
    public int addSupplyInfo(SupplyInfo supplyInfo) {
        int result = 0;
        try{
            supplyInfo.setGmtCreate(new Date());
            supplyInfoMapper.insertSelective(supplyInfo);
            result = 1;
            return result;
        } catch (Exception e){
            e.printStackTrace();
            return result;
        }
    }

    @Override
    public int deleteSupplyInfo(int pk) {
        try {
            supplyInfoMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateSupplyInfo(SupplyInfo supplyInfo) {
        try {
            supplyInfo.setGmtModified(new Date());
            supplyInfoMapper.updateByPrimaryKeySelective(supplyInfo);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }
}
