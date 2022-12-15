package edu.global.ex.mapper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class SecurityController {

    @GetMapping("/")
    public String index(){

        log.info("index() ..");

        return "main";
    }
    @GetMapping("/user/userHome")
    public String userHome(){

        log.info("userHome() ..");
        //model.addAttribute("memberBoard",memberService.getMemberList());

        return "/user/userHome";
    }
    @GetMapping("/admin/adminHome")
    public String userAdmin(){

        log.info("userAdmin() ..");
        //model.addAttribute("memberBoard",memberService.getMemberList());

        return "/admin/adminHome";
    }
}
