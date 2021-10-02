package com.hl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {

    //@RequestMapping(value ="/re/{a}/{b}",method = {RequestMethod.GET})
    @GetMapping("/re/{a}/{b}")
    public String test1(@PathVariable int a,@PathVariable String b, Model model){
        String msg=a+b;
        model.addAttribute("msg",msg);
        return "hello";
    }

    //@RequestMapping(value ="/re/{a}/{b}",method = {RequestMethod.POST})
    @PostMapping("/re/")
    public String test2(@PathVariable int a,@PathVariable int b, Model model){
        int msg=a+b;
        model.addAttribute("msg",msg);
        return "hello";
    }

    //@RequestMapping(value ="/re/{a}/{b}",method = {RequestMethod.POST})
    @GetMapping("/re/")
    public String test3(@PathVariable int a,@PathVariable int b, Model model){
        int msg=a+b;
        model.addAttribute("msg",msg);
        return "hello";
    }
}
