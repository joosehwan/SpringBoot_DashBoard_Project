package com.example.DashBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
        public String home() {
        return "home/login";
        }

    @GetMapping("/guest")
    public String guestAccess() {
        return "mainPage/gymProject"; // 또는 비회원용 루틴 목록 페이지 등
    }

}
