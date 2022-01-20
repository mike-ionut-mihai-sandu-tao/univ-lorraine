package fr.miage.script;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping(value="/helloworld")
public class Controller {


    @GetMapping
    public String get(Model model) {
        model.addAttribute("student", "Tristan");
        return "helloworld";
    }
}
