package com.ci.pipeline.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CIController {

    @GetMapping("/hello")
    public String greeting(){
        return "Hello World !!!";
    }
    @GetMapping("/check")
    public String check(){
        return "ci-pipeline checked  ";
    }
}
