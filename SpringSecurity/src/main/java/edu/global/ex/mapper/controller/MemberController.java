package edu.global.ex.mapper.controller;

import edu.global.ex.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/index")
    public String index(Model model){

        log.info("index() ..");
        model.addAttribute("memberBoard",memberService.getMemberList());

        return "practice";
    }
}
