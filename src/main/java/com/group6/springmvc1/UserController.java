package com.group6.springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping(value = "/aaa")
    public String login(String username, String password){
        if(username.equals("tom")&&password.equals("123")){
            return "index";
        } else {

            return "mis";
        }
//        System.out.println("hello, 进入到方法内部了");
    }
}
