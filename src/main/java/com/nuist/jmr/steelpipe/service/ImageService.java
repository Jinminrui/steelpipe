package com.nuist.jmr.steelpipe.service;

import com.nuist.jmr.steelpipe.dto.ImageHolder;
import com.nuist.jmr.steelpipe.entity.Image;

import java.util.List;

public interface ImageService {
    List<Image> findAllImage(int pageNum, int pageSize);
    int addImage(Image image, ImageHolder imageHolder);
    int deleteImage(int pk);
    int updateImage(Image image);
}
