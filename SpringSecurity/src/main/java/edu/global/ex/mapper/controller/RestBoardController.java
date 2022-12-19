package edu.global.ex.mapper.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequestMapping("/boards")
public class RestBoardController {

    @GetMapping("/login")
    public String login(){
        log.info("login() ..");
        return "/login/login";
    }

    @GetMapping("/loginInfo")
    public String loginInfo(Authentication authentication, Principal principal) {
        log.info("loginInfo()..");

        String user_id;



        //1.SpringContextHolder를 통하여 가져오는 방법(일반적인 빈에서 사용 할수있음)
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        user_id = auth.getName();
        System.out.println("유저 아이디:" + user_id   );

        //2.authentication 객체로 가져오는 방법(많은 정보를 가져 올수 있다. )
        System.out.println("authentication 유저 아이디:" + authentication.getName()   );
        System.out.println("authentication 권한들:" + authentication.getAuthorities()   );


        //3.Principal 객체로 가져오는 방법(가져올수 있는게 getName() 정도
        System.out.println("Principal 유저 아이디:" + principal.getName() );


        return "redirect:/";
    }
}
