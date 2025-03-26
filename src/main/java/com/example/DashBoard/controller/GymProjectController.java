package com.example.DashBoard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GymProjectController {

    @GetMapping("/gymProject")
    public String gymProjectPage() {
        return "gymProject"; // templates/gymProject.html
    }
}
