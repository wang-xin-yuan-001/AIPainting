package com.aipainting;

import com.aipainting.pojo.ReqGetImg;
import com.aipainting.service.ImgService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AppAiPaintingServiceApplicationTests {

    @Autowired
    ImgService imgService;

    @Test
    void contextLoads() {
    }

    @Test
    void getImg() {
        String imgName = "1689824143760-0.png";
        ReqGetImg reqGetImg = new ReqGetImg();
        reqGetImg.setImgName(imgName);
        String img = imgService.getImg(reqGetImg);
        System.out.println(img);
    }

}
