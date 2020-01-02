package com.hospital.purchase.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mycontroller {
    @RequestMapping("/query_statistics")
    public String hello(){
        return "query_statistics";
    }
}
