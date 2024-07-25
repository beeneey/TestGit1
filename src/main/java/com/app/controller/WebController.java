package com.app.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class WebController {
    @GetMapping("/")
    public String home() {
        return "환영합니다ㅣ";
    }
    
}
