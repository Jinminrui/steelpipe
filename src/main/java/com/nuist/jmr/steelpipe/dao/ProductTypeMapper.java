package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.ProductType;
import com.nuist.jmr.steelpipe.entity.ProductTypeExample;
import java.util.List;

public interface ProductTypeMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(ProductType record);

    int insertSelective(ProductType record);

    List<ProductType> selectByExample(ProductTypeExample example);

    ProductType selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(ProductType record);

    int updateByPrimaryKey(ProductType record);
}