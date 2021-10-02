package com.hl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//方法中只要是String类型的返回模式 那么这个 return "XXX" 就会经过视图解析器跳转到相应的界面 并展示给用户
public class HellController {

    @RequestMapping("/h1/hello")
    public String test1(Model model){
        model.addAttribute("msg","Hello Controller1");
        return "hello";
    }

    @RequestMapping("/h1/hello2")
    public String test2(Model model){
        model.addAttribute("msg","Hello Controller2");
        return "redirect:/index.jsp";
    }
}
