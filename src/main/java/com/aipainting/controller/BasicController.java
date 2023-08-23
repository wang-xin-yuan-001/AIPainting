/*
 * Copyright 2013-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aipainting.controller;

import com.aipainting.pojo.ReqGetImg;
import com.aipainting.pojo.Result;
import com.aipainting.service.ImgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author <a href="mailto:chenxilzx1@gmail.com">theonefx</a>
 */
@RestController
public class BasicController {

    @Autowired
    ImgService imgService;

    @GetMapping("/hello")
    @ResponseBody
    public Result hello(@RequestParam(name = "name", defaultValue = "unknown user") String name) {
        return new Result(200, "Hello " + name, "ok");
    }

    @PostMapping("/getImg")
    @ResponseBody
    public Result getImg(@RequestBody ReqGetImg reqGetImg) {
        System.out.println(reqGetImg);
        String url = imgService.getImg(reqGetImg);
        return new Result(200, url, "ok");
    }
}
