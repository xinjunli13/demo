package com.xin.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: xinjl
 * @Date: 2018/11/14 12:00
 * @Description:
 */

@Controller
public class PageController {

    @RequestMapping("index.html")
    public String index(){
        return "index";
    }
}
