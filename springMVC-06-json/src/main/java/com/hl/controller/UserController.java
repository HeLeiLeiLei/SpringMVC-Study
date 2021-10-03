package com.hl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hl.pojo.User;
import com.hl.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

//@Controller
@RestController//代表这个类里面的所有方法都返回json数据 不会去走视图解析器
public class UserController {

    @RequestMapping("/u/j1")
    //@ResponseBody//代表这个方法返回json数据  不会去走视图解析器
    public String json_01() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1, "小何", 18,new Date());
        String s = objectMapper.writeValueAsString(user);
        System.out.println(s);
        return s;
    }

    @RequestMapping("/u/j2")
    //@ResponseBody//代表这个方法返回json数据  不会去走视图解析器
    public String json_02() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//        User user1 = new User(1, "小何", 18);
//        User user2 = new User(2, "小何", 18);
//        User user3 = new User(3, "小何", 18);
//        User user4 = new User(4, "小何", 18);
//        ArrayList<User> list = new ArrayList<User>();
//        list.add(user1);
//        list.add(user2);
//        list.add(user3);
//        list.add(user4);
//        String s = objectMapper.writeValueAsString(list);
//        System.out.println(s);
//        return s;

        User user1 = new User(1, "小何", 18,new Date());
        User user2 = new User(2, "小何", 18,new Date());
        User user3 = new User(3, "小何", 18,new Date());
        User user4 = new User(4, "小何", 18,new Date());
        ArrayList<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);

        return JsonUtils.getJson(list);

    }

    @RequestMapping("/u/j3")
    //@ResponseBody//代表这个方法返回json数据  不会去走视图解析器
    public String json_03() throws JsonProcessingException {
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        Date date = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        return objectMapper.writeValueAsString(sdf.format(date));

        Date date = new Date();
        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
}
