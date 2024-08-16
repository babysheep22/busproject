package com.example.busproject3.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

    @GetMapping(value = {"/main", "/busbusan/main"})
    public String main(){
        return "main";
    }
}
