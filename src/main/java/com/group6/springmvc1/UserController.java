package com.group6.springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/aaa")
    public void login(String username, String password){
        System.out.println(username);
        System.out.println(password);
        System.out.println("hello, 进入到方法内部了");
    }
}
