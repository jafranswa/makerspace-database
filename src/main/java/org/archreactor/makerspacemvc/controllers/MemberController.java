package org.archreactor.makerspacemvc.controllers;

import org.archreactor.makerspacemvc.models.data.MemberDao;
import org.archreactor.makerspacemvc.models.forms.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "member")
public class MemberController {

    @Autowired
    private MemberDao memberDao;

    @RequestMapping(value = "", method = RequestMethod.GET)
    private String indexRender (Model model){
        model.addAttribute("members",memberDao.findAll());
        model.addAttribute(new Member());
        model.addAttribute("title", "MakerMember");
        return "member/index";
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    private  String indexAddMember (@ModelAttribute Member newMember, Model model){
        model.addAttribute("members",memberDao.findAll());
        model.addAttribute("title", "MakerMember");
        //TODO- add error messages
        memberDao.save(newMember);
        return "redirect:member";
    }
}
