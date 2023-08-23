package com.aipainting.service;

import com.aipainting.iface.IImgService;
import com.aipainting.pojo.ReqGetImg;
import com.aipainting.pojo.Result;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ImgService implements IImgService {
    private final String BASE_URL = "https://ai-painting-api.hellobike.cn";

    @Override
    public String getImg(ReqGetImg reqGetImg) {
        return "图片地址";
    }
}
