package com.hl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class TestController {

    @GetMapping("/toTest1")
    public String test1(){
        System.out.println("进入TestController----》test1()执行");
        return "OK";
    }

    @RequestMapping("/goLogin")
    public String goLogin(){
        return "login";
    }

    @RequestMapping("/goMain")
    public String goMain(){
        return "main";
    }

    @RequestMapping("/Login")
    public String Login(String userName,HttpSession session){
        System.out.println("进入到Login");
        System.out.println(userName);
        session.setAttribute("userInfor",userName);
        return "main";
    }

}

