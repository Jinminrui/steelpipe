package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.DemandInfo;
import com.nuist.jmr.steelpipe.entity.DemandInfoExample;
import java.util.List;

public interface DemandInfoMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(DemandInfo record);

    int insertSelective(DemandInfo record);

    List<DemandInfo> selectByExample(DemandInfoExample example);

    DemandInfo selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(DemandInfo record);

    int updateByPrimaryKey(DemandInfo record);
}