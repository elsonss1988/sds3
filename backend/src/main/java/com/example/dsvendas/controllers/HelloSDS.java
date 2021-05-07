package com.example.dsvendas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSDS {
    @GetMapping("/")
    public String Hello(){
        return "Hello to SDS3";
    }
}
