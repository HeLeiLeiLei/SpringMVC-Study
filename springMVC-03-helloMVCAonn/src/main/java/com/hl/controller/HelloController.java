package com.hl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller//就理就类似  ioc的思想 就省去了<bean id="HelloController" class="com.hl.controller.HelloController">
public class HelloController {
    @RequestMapping("/hello")
    public String hello1(Model model){
        model.addAttribute("msg","Hello SpringMVC");
        return "hello";
    }
}
