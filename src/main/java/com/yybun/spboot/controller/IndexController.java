package com.yybun.spboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/indexPage")
    public String index() {
        return "/index.html";
    }
}
