package com.nuist.jmr.steelpipe.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nuist.jmr.steelpipe.dto.ImageHolder;
import com.nuist.jmr.steelpipe.entity.Image;
import com.nuist.jmr.steelpipe.service.ImageService;
import com.nuist.jmr.steelpipe.util.HttpServletRequestUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/image")
@CrossOrigin(value = "*", maxAge = 3600)
public class ImageController {
    @Autowired
    ImageService imageService;

    @RequestMapping(value = "/list/{pageNum}/{pageSize}")
    public Map<String, Object> findAllImage(@PathVariable("pageNum") int pageNum,
                                            @PathVariable("pageSize") int pageSize){
        Map<String, Object> map = new HashMap<>();
        try {
            List<Image> imageList = imageService.findAllImage(pageNum,pageSize);
            map.put("code", "10000");
            map.put("message","查询成功！");
            map.put("imageList", imageList);
            return map;
        } catch (Exception e) {
            map.put("code","00000");
            map.put("message","出错了！");
            return map;
        }
    }

    @PostMapping(value = "/add")
    public Map<String, Object> addImage(HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        String imgInfo = HttpServletRequestUtil.getString(request, "imgInfo");
        ObjectMapper mapper = new ObjectMapper();
        Image image = null;
        try {
            image = mapper.readValue(imgInfo, Image.class);
        } catch (IOException e) {
            e.printStackTrace();
            map.put("code", "00000");
            map.put("message", "出错了");
            return map;
        }
        CommonsMultipartFile imgFile = null;
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        MultipartHttpServletRequest multipartHttpServletRequest = (MultipartHttpServletRequest) request;
        imgFile = (CommonsMultipartFile) multipartHttpServletRequest.getFile("imgFile");

        if (imgFile != null && image!=null){
            try {
                ImageHolder imageHolder = new ImageHolder(imgFile.getOriginalFilename(), imgFile.getInputStream());
                imageService.addImage(image, imageHolder);
                map.put("code", "10000");
                map.put("message","添加成功");
                return map;
            } catch (IOException e) {
                e.printStackTrace();
                map.put("code", "00000");
                map.put("message", "出错了");
                return map;
            }
        } else {
            map.put("code", "00000");
            map.put("message", "出错了");
            return map;
        }
    }
}
