package com.wildcodeschool.avengers.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome(){
        return "Welcome to the S.H.I.E.L.D !";
    }

    @GetMapping("/avengers/assemble")
    public String assemble(){
        return "Avengers... Assemble !";
    }
}
