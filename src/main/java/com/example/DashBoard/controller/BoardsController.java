package com.example.DashBoard.controller;


import com.example.DashBoard.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/list")
public class BoardsController {
    private final BoardService boardService;

    @GetMapping
    public String boards(Model model) {
        model.addAttribute("boards", boardService.findAll());
        return "board/list";
    }
}
