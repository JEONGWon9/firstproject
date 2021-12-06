package com.example.firstproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hello")
    public String hellow(Model model){

        model.addAttribute("username","아이스크림");
        return "hello";
    }

    @GetMapping("/bye")
    public String bye(Model model){

        model.addAttribute("nickname","아이송");
        return "goodbye";
    }

}
