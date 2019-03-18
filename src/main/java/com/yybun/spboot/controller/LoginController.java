package com.yybun.spboot.controller;

import com.yybun.spboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/user")
public class LoginController {

    @Autowired
    IUserService userService;
    @GetMapping("/login")
    public Map<String, Object> login(@RequestParam("account") String account, @RequestParam("password") String password) {
        return userService.login(account, password);
    }
}
