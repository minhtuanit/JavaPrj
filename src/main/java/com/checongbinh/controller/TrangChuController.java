package com.checongbinh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.View;

@Controller
public class TrangChuController {

    @ResponseBody
    @RequestMapping("/")
    public String TrangChu(){

       return "tuan dep trai";

    }
}
