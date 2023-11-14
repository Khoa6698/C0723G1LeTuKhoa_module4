package com.example.bai_tap_2.controller;

import com.example.bai_tap_2.service.IVietnameseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class VietnameseController {
   @Autowired
   private IVietnameseService vietnameseService;
   @GetMapping("")
   public String showForm(){
       return "/viet_sub";
   }

   @GetMapping("/search")
   public String search(@RequestParam String english, Model model){
      String viSub = vietnameseService.search(english);
      model.addAttribute("viet",viSub);
      return "/viet_sub";
   }
}
