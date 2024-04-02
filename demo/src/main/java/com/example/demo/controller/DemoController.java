package com.example.demo.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("user")
public class DemoController {

    @GetMapping("/")
    public String getTest(){
        return "demo";
    }

    @PostMapping("/")
    public String saveTest(){
        return "demo";
    }

    @GetMapping("/rest")
    @ResponseBody
    public String testRest(){
        return "demo";
    }
}
