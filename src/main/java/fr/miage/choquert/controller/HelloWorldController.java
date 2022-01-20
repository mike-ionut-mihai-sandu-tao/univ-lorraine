package fr.miage.choquert.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/helloworld")
public class HelloWorldController {

    @GetMapping
    public String helloWorld(Model model){
        model.addAttribute("nom","Vincent");
        return  "helloworld.html";
    }

}
