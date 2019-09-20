package com.rui.tiger.auth.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxiang
 * @date 2019/9/20 11:05
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello,World";
    }
}