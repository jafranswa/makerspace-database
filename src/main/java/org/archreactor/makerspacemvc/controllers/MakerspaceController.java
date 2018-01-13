package org.archreactor.makerspacemvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping(value = "makerspace")
public class MakerspaceController {
    @RequestMapping(value = "")
    public String index(Model model){
        model.addAttribute("title", "ArchReactorMakerspace");
        return "makerspace/index";
    }
}
