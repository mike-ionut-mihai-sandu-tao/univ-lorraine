package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/greetings")
public class HelloWord {

        @GetMapping
        public String hello(
                Model model){
            model.addAttribute("nom","Quentin");
            return  "helloworld.html";
        }
}
