package org.archreactor.makerspacemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "makerspace")
public class MakerspaceController {
    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title", "STLMakerspace");
        return "makerspace/index";
    }
    @RequestMapping(value = "login")
    public String login(Model model){
        model.addAttribute("title", "STLMakerspace");
        return "makerspace/login";

    }
    @RequestMapping(value = "signup")
    public String signup(Model model){
        model.addAttribute("title", "STLMakerspace");
        return "makerspace/signup";

    }
    @RequestMapping(value = "mymakerspace")
    public String mymakerspace (Model model){
        model.addAttribute("title", "STLMakerspace");
        return "makerspace/mymakerspace";

    }
}

