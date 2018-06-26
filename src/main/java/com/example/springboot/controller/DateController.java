package com.example.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class DateController {

    @RequestMapping("/date")
    public String retDate(){
        return new Date().toString();
    }
}
