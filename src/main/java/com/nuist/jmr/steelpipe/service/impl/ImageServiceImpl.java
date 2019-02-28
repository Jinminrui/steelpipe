package com.nuist.jmr.steelpipe.service.impl;

import com.github.pagehelper.PageHelper;
import com.nuist.jmr.steelpipe.dao.ImageMapper;
import com.nuist.jmr.steelpipe.dto.ImageHolder;
import com.nuist.jmr.steelpipe.entity.Image;
import com.nuist.jmr.steelpipe.entity.ImageExample;
import com.nuist.jmr.steelpipe.service.ImageService;
import com.nuist.jmr.steelpipe.util.ImageUtil;
import com.nuist.jmr.steelpipe.util.PathUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.jvm.hotspot.debugger.Page;

import java.util.Date;
import java.util.List;

@Transactional()
@Service(value = "imageService")
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public List<Image> findAllImage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        ImageExample imageExample = new ImageExample();
        return imageMapper.selectByExample(imageExample);
    }

    @Override
    public int addImage(Image image, ImageHolder imageHolder) {
        try {
            image.setGmtCreate(new Date());
            image.setGmtModified(new Date());
            addImageFile(image, imageHolder);
            imageMapper.insertSelective(image);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int deleteImage(int pk) {
        try {
            imageMapper.deleteByPrimaryKey(pk);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }

    @Override
    public int updateImage(Image image) {
        try {
            image.setGmtModified(new Date());
            imageMapper.updateByPrimaryKeySelective(image);
            return 1;
        } catch (Exception e){
            e.printStackTrace();
            return 0;
        }
    }


    private void addImageFile(Image image, ImageHolder imgFile){
        //获取shop图片目录的相对值路径
        String dest = PathUtil.getImagePath(image.getImgType());
        String imgAddr = ImageUtil.generatePath(imgFile, dest);
        image.setImgUrl(imgAddr);
    }
}
