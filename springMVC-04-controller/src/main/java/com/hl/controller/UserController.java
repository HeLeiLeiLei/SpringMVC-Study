package com.hl.controller;

import com.hl.pojo.User;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    @PostMapping("/user/t1")
    public String test1(String username, Model model){
        System.out.println(username);
        model.addAttribute("msg",username);
        return "hello";
    }
    @GetMapping("/user/t1")
    public String test2(String username, Model model){
        System.out.println(username);
        model.addAttribute("msg",username);
        return "hello";
    }

    @PostMapping("/user/t3")
    public String test3(User user,Model model){
        System.out.println(user);
        model.addAttribute("user",user);
        return "hello";
    }

    @PostMapping("/user/t4")
    public String test4(@RequestParam("ids")String ids[], Model model){
        List list = new ArrayList();
        for (int i=0;i<ids.length;i++){
            list.add(ids[i]);
            System.out.println(list.get(i));
        }

        return "hello";
    }
}
