package com.grope6.design.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class CustomerIndexContruller {
    @RequestMapping("/customer/index")
    public String login(){

        return "customer/index";
    }
}
