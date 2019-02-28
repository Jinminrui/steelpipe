package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.dto.SupplyDetail;
import com.nuist.jmr.steelpipe.entity.SupplyInfo;
import com.nuist.jmr.steelpipe.entity.SupplyInfoExample;
import java.util.List;

public interface SupplyInfoMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(SupplyInfo record);

    int insertSelective(SupplyInfo record);

    List<SupplyInfo> selectByExample(SupplyInfoExample example);

    SupplyInfo selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(SupplyInfo record);

    int updateByPrimaryKey(SupplyInfo record);
}