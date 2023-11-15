package com.example.caculator.controller;

import com.example.caculator.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @Autowired
    private ICaculatorService caculatorService;

    @GetMapping("")
    public String showForm(){
        return "/form";
    }

    @PostMapping("/caculator")
    public String caculator(@RequestParam String caculator,
                            @RequestParam double number1,
                            @RequestParam double number2, Model model){
        String result = caculatorService.caculator(caculator,number1,number2);
        model.addAttribute("result",result);
        return "/form";
    }
}
