package com.kiab.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SumaController {
    @GetMapping("/sumar")
    public int sumar(
            @RequestParam int a,
            @RequestParam int b
    ){
        return a+b;
    }

    @GetMapping("/ping")
    @ResponseBody
    public String ping() {
    return "alive";
    }

    @GetMapping("/index")
    public String home() {
        return "viee";
    }

}
