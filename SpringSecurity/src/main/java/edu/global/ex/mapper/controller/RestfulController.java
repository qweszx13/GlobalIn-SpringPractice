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
/*
기존의 jsp 기반의 Controller가 아님을 알려줌
Restful 기반임을 알려주는 어노테이션
* */
@RestController //기존과의 법칙과는 다르다
@RequestMapping("/restful")
public class RestfulController {

    @GetMapping("/")
    public String restMain(){
        return "안녕히 가세요 ~~ 저는 희망과 뭐를 찾아 떠납니다.";
    }


}
