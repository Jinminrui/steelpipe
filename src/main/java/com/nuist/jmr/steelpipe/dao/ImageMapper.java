package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.Image;
import com.nuist.jmr.steelpipe.entity.ImageExample;
import java.util.List;

public interface ImageMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(Image record);

    int insertSelective(Image record);

    List<Image> selectByExample(ImageExample example);

    Image selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(Image record);

    int updateByPrimaryKey(Image record);
}