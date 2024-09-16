package com.mam.mamproject.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MemberController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    

    @GetMapping("/login") // 로그인 페이지 경로
    public String login() {
        return "login"; // login.html 또는 login.jsp와 같은 뷰 이름
    }
}
