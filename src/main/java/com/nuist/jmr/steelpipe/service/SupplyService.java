package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.dto.SupplyDetail;
import com.nuist.jmr.steelpipe.entity.SupplyInfo;

import java.util.List;

public interface SupplyService {
    List<SupplyInfo> findAllSupplyInfo(int pageNum, int pageSize);

    int addSupplyInfo(SupplyInfo supplyInfo);

    int deleteSupplyInfo(int pk);

    int updateSupplyInfo(SupplyInfo supplyInfo);
}
