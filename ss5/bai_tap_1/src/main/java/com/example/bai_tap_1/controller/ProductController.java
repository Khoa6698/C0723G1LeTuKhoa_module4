package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.model.Product;
import com.example.bai_tap_1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String list(Model model) {
        List<Product> productList = productService.findAll();
        model.addAttribute("productList", productList);
        return "/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/create";
    }

    @PostMapping("/save")
    public String create(Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("message", "All new product successfully");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("message", "Update product successfully");
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String delete(int id , RedirectAttributes redirectAttributes){
        productService.remove(id);
        redirectAttributes.addFlashAttribute("message", " delete product successfully");
        return "redirect:/product";
    }

    @GetMapping("/{id}/detail")
    public String showFormDetail(@PathVariable int id, Model model){
        model.addAttribute("product", productService.findById(id));
        return "/detail";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model, RedirectAttributes redirectAttributes){
        List<Product> products = new ArrayList<>();
        List<Product> products1 = productService.findAll();
        for (int i = 0; i < products1.size(); i++) {
            if(products1.get(i).getName().contains(name)){
                products.add(products1.get(i));
            }
        }
        model.addAttribute("productList", products);
        model.addAttribute("name", name);
        return "/list";
    }
}