package fr.miage.script;

import org.apache.coyote.Request;
import org.springframework.lang.Nullable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
@RequestMapping(value="/helloworld")
public class Controller {


    @GetMapping
    public String get(Model model, @Nullable @RequestParam(name = "student") String param) {
        if(param != null){
            model.addAttribute("student", param);
        }else {
            model.addAttribute("student", "");
        }

        return "helloworld";
    }
}
