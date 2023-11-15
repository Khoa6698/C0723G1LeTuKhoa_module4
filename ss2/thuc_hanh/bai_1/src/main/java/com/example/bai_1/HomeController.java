package com.example.bai_1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Controller
public class HomeController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;

    public HomeController(){
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping( "")
    public String home(){
        return "/home";
    }

    private boolean validate(String regex){
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
   @PostMapping("/validate")
    public String user(@RequestParam String email, Model model){
        boolean isValid = this.validate(email);
        if (!isValid){
            model.addAttribute("mess","Email is invalid");
            return "/home";
        }
        model.addAttribute("email",email);
        return "/success";
   }
}
