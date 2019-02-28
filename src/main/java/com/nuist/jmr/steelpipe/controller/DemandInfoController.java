package com.nuist.jmr.steelpipe.controller;

import com.nuist.jmr.steelpipe.dto.DemandDetail;
import com.nuist.jmr.steelpipe.entity.DemandInfo;
import com.nuist.jmr.steelpipe.service.DemandService;
import com.nuist.jmr.steelpipe.service.ProductTypeService;
import com.nuist.jmr.steelpipe.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/demandInfo")
@CrossOrigin(value = "*", maxAge = 3600)
public class DemandInfoController {
    @Autowired
    DemandService demandService;

    @Autowired
    ProductTypeService productTypeService;

    @Autowired
    UserService userService;

    @RequestMapping("/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllDemand(@PathVariable("pageNum") int pageNum,
                                             @PathVariable("pageSize") int pageSize){
        Map<String, Object> map = new HashMap<>();
        try {
            List<DemandDetail> demandDetailList = new ArrayList<>();
            List<DemandInfo> demandInfoList = demandService.findAllDemandInfo(pageNum,pageSize);
            for (DemandInfo item : demandInfoList){
                DemandDetail temp = new DemandDetail();
                String productType = productTypeService.findById(item.getProductTypeId()).getProductTypeName();
                String supplyFromName = userService.findById(item.getDemandFrom()).getNickname();
                String supplyFromPhone = userService.findById(item.getDemandFrom()).getPhone();
                temp.setDemandInfo(item);
                temp.setProductType(productType);
                temp.setDemandFromName(supplyFromName);
                temp.setDemandFromPhone(supplyFromPhone);
                demandDetailList.add(temp);
            }
            map.put("code", "10000");
            map.put("message","查询成功！");
            map.put("supplyDetailList", demandDetailList);
            return map;
        } catch (Exception e) {
            map.put("code","00000");
            map.put("message","出错了！");
            return map;
        }
    }
}
