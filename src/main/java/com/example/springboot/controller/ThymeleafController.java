package com.example.springboot.controller;

import com.example.springboot.controller.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;

@Controller
@CrossOrigin(origins="http://localhost:63342")
public class ThymeleafController {

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map) {
        map.put("msg", "Hello Thymeleaf");
        return "hello";
    }

    @RequestMapping("/user")
    @ResponseBody
    public User retUser() throws Exception {
        User s = new User();
        s.setId(1);
        s.setUsername("zhangsan");
        s.setPassword("123");
        s.setBirthday(new Date());
//        throw new Exception("返回json错误");
        return s;
    }
}