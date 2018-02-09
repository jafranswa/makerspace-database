package org.archreactor.makerspacemvc.controllers;

import org.archreactor.makerspacemvc.models.data.ReaderDao;
import org.archreactor.makerspacemvc.models.forms.Reader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "reader")
public class ReaderController {

    @Autowired
    private ReaderDao readerDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    private String indexRender (Model model){
        model.addAttribute("readers",readerDao.findAll());
        model.addAttribute(new Reader());
        model.addAttribute("title", "Key Card Readers");

        return "reader/index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    private String indexAddReader (@ModelAttribute Reader newReader, Model model){
        model.addAttribute("readers", readerDao.findAll());
        model.addAttribute("title", "Key Card Readers");
        //TODO- add errors
        readerDao.save(newReader);
        return "redirect:reader";
    }
}
