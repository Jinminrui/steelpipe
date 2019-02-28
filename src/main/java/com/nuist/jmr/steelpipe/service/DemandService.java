package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.entity.DemandInfo;

import java.util.List;

public interface DemandService {
    List<DemandInfo> findAllDemandInfo(int pageNum, int pageSize);

    int addDemandInfo(DemandInfo demandInfo);

    int deleteDemandInfo(int pk);

    int updateDemandInfo(DemandInfo demandInfo);
}
