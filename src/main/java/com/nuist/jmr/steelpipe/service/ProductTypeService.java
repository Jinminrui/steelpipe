package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.entity.ProductType;

import java.util.List;

public interface ProductTypeService {
    int addType(ProductType productType);
    List<ProductType> findAllType(int pageNum, int pageSize);
    int deleteType(int pk);
    int updateType(ProductType productType);
    ProductType findById(int pk);
}
