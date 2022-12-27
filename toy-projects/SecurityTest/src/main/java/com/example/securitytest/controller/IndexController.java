package com.example.securitytest.controller;

import com.example.securitytest.dto.TokenInfo;
import com.example.securitytest.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class IndexController {

    private final MemberService memberService;

    @GetMapping("/login")
    public TokenInfo home() {
        return memberService.login("jm","1");
    }

}
