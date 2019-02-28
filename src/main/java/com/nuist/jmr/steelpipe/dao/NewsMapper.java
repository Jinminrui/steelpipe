package com.nuist.jmr.steelpipe.dao;

import com.nuist.jmr.steelpipe.entity.News;
import com.nuist.jmr.steelpipe.entity.NewsExample;
import java.util.List;

public interface NewsMapper {
    int deleteByPrimaryKey(Integer pkId);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Integer pkId);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}