package com.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/index")
public class IndexController {

    @GetMapping()    
    public String index() {
        return "index";
    }
}
