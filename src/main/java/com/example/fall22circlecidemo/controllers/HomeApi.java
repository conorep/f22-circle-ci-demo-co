package com.example.fall22circlecidemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class HomeApi
{
    @GetMapping("home")
    public String home()
    {
        return "Hello, world....";
    }
}
