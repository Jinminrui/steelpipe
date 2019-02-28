package com.nuist.jmr.steelpipe.controller;

import com.nuist.jmr.steelpipe.entity.ProductType;
import com.nuist.jmr.steelpipe.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/productType")
@CrossOrigin(value = "*", maxAge = 3600)
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;

    @PostMapping("/add")
    public Map<String, Object> addProductType(ProductType type){
        Map<String, Object> map = new HashMap<>();
        int result = productTypeService.addType(type);
        if (result == 1) {
            map.put("code", "10000");
            map.put("message", "添加产品类型成功");
        } else if (result == 2) {
            map.put("code", "20000");
            map.put("message", "此产品类型已存在");
        } else if (result == 0) {
            map.put("code", "00000");
            map.put("message", "添加产品类型失败");
        }
        return map;
    }

    @RequestMapping(value = "/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllType(@PathVariable("pageNum") int pageNum,
                                           @PathVariable("pageSize") int pageSize){
        Map<String, Object> map = new HashMap<>();
        try {
            List<ProductType> productTypeList = productTypeService.findAllType(pageNum,pageSize);
            map.put("code", "10000");
            map.put("message","查询成功！");
            map.put("productTypeList",productTypeList);
            return map;
        } catch (Exception e){
            e.printStackTrace();
            map.put("code","00000");
            map.put("message","出错了！");
            return map;
        }
    }

    @PostMapping(value = "/delete")
    public Map<String, Object> deleteType(@RequestBody ProductType productType){
        Map<String, Object> map = new HashMap<>();
        int result = productTypeService.deleteType(productType.getPkId());
        if (result == 1){
            map.put("code","10000");
            map.put("message", "删除成功");
        } else {
            map.put("code","00000");
            map.put("message", "删除失败");
        }
        return map;
    }

    @PostMapping(value = "/update")
    public Map<String, Object> updateType(@RequestBody ProductType productType){
        Map<String, Object> map = new HashMap<>();
        int result = productTypeService.updateType(productType);
        if (result == 1){
            map.put("code","10000");
            map.put("message", "更新成功");
        } else {
            map.put("code","00000");
            map.put("message", "更新失败");
        }
        return map;
    }
}
