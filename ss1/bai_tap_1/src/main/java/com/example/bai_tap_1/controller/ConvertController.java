package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ConvertController {
    @Autowired
    private IConvertService convertService;
    @GetMapping("")
    public String showForm(){
        return "/currency_conversion";
    }
    @PostMapping("/convert")
    public String useToVnd(double usd, Model model){
        double vnd = convertService.UsdToVnd(usd);
        model.addAttribute("vnd",vnd);
        return "/currency_conversion";
    }
}
