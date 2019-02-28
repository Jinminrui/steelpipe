package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.DemandInfoMapper;
import com.nuist.jmr.steelpipe.entity.DemandInfo;
import com.nuist.jmr.steelpipe.entity.DemandInfoExample;
import com.nuist.jmr.steelpipe.service.DemandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional()
@Service(value = "/demandService")
public class DemandServiceImpl implements DemandService {
    @Autowired
    DemandInfoMapper demandInfoMapper;

    @Override
    public List<DemandInfo> findAllDemandInfo(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        DemandInfoExample demandInfoExample = new DemandInfoExample();
        return demandInfoMapper.selectByExample(demandInfoExample);
    }

    @Override
    public int addDemandInfo(DemandInfo demandInfo) {
        try {
            demandInfo.setGmtCreate(new Date());
            demandInfoMapper.insertSelective(demandInfo);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int deleteDemandInfo(int pk) {
        try {
            demandInfoMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateDemandInfo(DemandInfo demandInfo) {
        try {
            demandInfo.setGmtModified(new Date());
            demandInfoMapper.updateByPrimaryKeySelective(demandInfo);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
