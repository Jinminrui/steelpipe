package com.nuist.jmr.steelpipe.controller;

import com.nuist.jmr.steelpipe.dto.SupplyDetail;
import com.nuist.jmr.steelpipe.entity.SupplyInfo;
import com.nuist.jmr.steelpipe.service.ProductTypeService;
import com.nuist.jmr.steelpipe.service.SupplyService;
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
@RequestMapping(value = "/api/supplyInfo")
@CrossOrigin(value = "*", maxAge = 3600)
public class SupplyInfoController {
    @Autowired
    SupplyService supplyService;
    @Autowired
    ProductTypeService productTypeService;
    @Autowired
    UserService userService;

    @RequestMapping("/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllSupply(@PathVariable("pageNum") int pageNum,
                                             @PathVariable("pageSize") int pageSize){
        Map<String, Object> map = new HashMap<>();
        try {
            List<SupplyDetail> supplyDetailList = new ArrayList<>();
            List<SupplyInfo> supplyInfoList = supplyService.findAllSupplyInfo(pageNum,pageSize);
            for (SupplyInfo item : supplyInfoList){
                SupplyDetail temp = new SupplyDetail();
                String productType = productTypeService.findById(item.getProductTypeId()).getProductTypeName();
                String supplyFromName = userService.findById(item.getSupplyFrom()).getNickname();
                String supplyFromPhone = userService.findById(item.getSupplyFrom()).getPhone();
                temp.setSupplyInfo(item);
                temp.setProductType(productType);
                temp.setSupplyFromName(supplyFromName);
                temp.setSupplyFromPhone(supplyFromPhone);
                supplyDetailList.add(temp);
            }
            map.put("code", "10000");
            map.put("message","查询成功！");
            map.put("supplyDetailList", supplyDetailList);
            return map;
        } catch (Exception e) {
            map.put("code","00000");
            map.put("message","出错了！");
            return map;
        }
    }
}
