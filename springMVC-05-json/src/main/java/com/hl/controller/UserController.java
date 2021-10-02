package com.hl.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hl.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @RequestMapping("/j/json1")
    @ResponseBody//他就不会走视图解析器，会直接返回一个字符串
    public String json_01() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();
        User user = new User(1,"小何",18);
        String str=objectMapper.writeValueAsString(user);

        return str;
    }
}
