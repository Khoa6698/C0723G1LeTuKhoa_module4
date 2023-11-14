package com.example.thuc_hanh.controller;

import com.example.thuc_hanh.model.Customer;
import com.example.thuc_hanh.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @GetMapping("/customers")
    public String showList(Model model){
        List<Customer> customerList = customerService.fillAll();
        model.addAttribute("list",customerList);
        return "/customers/list";
    }
}
