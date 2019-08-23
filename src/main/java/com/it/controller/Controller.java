package com.it.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public  class  Controller{
    @RequestMapping("/quick")
    public String quick(){
        return "springboot";
    }
}