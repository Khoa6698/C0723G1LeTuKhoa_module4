package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.dto.UserDto;
import com.example.bai_tap_1.model.User;
import com.example.bai_tap_1.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("")
    public String result() {
        return "result";
    }

    @GetMapping("create")
    public String showForm(@ModelAttribute UserDto userDto, Model model) {
        model.addAttribute("userDto", userDto);
        return "index";
    }

    @PostMapping("create")
    public String create(@Valid @ModelAttribute UserDto userDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        User user = new User();
        new UserDto().validate(userDto, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "index";
        }
        userService.newUser(user);
        redirectAttributes.addFlashAttribute("mess", "Sign In Success");
        return "redirect:/user";
    }
}
