package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.ProductTypeMapper;
import com.nuist.jmr.steelpipe.entity.ProductType;
import com.nuist.jmr.steelpipe.entity.ProductTypeExample;
import com.nuist.jmr.steelpipe.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Transactional()
@Service(value = "productTypeService")
public class ProductTypeServiceImpl implements ProductTypeService {
    @Autowired
    private ProductTypeMapper productTypeMapper;

    @Override
    public int addType(ProductType productType) {
        int result = 0;
        try {
            ProductTypeExample productTypeExample = new ProductTypeExample();
            productTypeExample.or().andProductTypeNameEqualTo(productType.getProductTypeName());
            List<ProductType> productTypeList = productTypeMapper.selectByExample(productTypeExample);
            if (productTypeList.size()!=0){
                result = 2;
            } else {
                productType.setGmtCreated(new Date());
                productTypeMapper.insertSelective(productType);
                result = 1;
            }
            return result;
        }catch (Exception e){
            e.printStackTrace();
            return result;
        }
    }

    @Override
    public List<ProductType> findAllType(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ProductTypeExample productTypeExample = new ProductTypeExample();
        return productTypeMapper.selectByExample(productTypeExample);
    }

    @Override
    public int deleteType(int pk) {
        try {
            productTypeMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateType(ProductType productType) {
        try {
            productType.setGmtModified(new Date());
            productTypeMapper.updateByPrimaryKeySelective(productType);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public ProductType findById(int pk) {
        return productTypeMapper.selectByPrimaryKey(pk);
    }
}
