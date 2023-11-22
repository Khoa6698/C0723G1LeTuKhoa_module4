package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.model.Blog;
import com.example.bai_tap_1.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String list(Model model) {
        List<Blog> blogList = blogService.findAll();
            model.addAttribute("blogList", blogList);
        return "views/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "views/create";
    }

    @PostMapping("/save")
    public String create(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.add(blog);
        redirectAttributes.addFlashAttribute("message", "All new product successfully");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String showFormEdit(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "views/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes redirectAttributes) {
        blogService.add(blog);
        redirectAttributes.addFlashAttribute("message", "Update product successfully");
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(int id , RedirectAttributes redirectAttributes){
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("message", " delete product successfully");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/detail")
    public String showFormDetail(@PathVariable int id, Model model){
        model.addAttribute("blog", blogService.findById(id));
        return "views/detail";
    }

    @GetMapping("/search")
    public String search(@RequestParam String name, Model model, RedirectAttributes redirectAttributes){
        List<Blog> blogs = new ArrayList<>();
        List<Blog> blogs1 = blogService.findAll();
        for (int i = 0; i < blogs1.size(); i++) {
            if(blogs1.get(i).getName().contains(name)){
                blogs.add(blogs1.get(i));
            }
        }
        model.addAttribute("blogList", blogs);
        model.addAttribute("name", name);
        return "views/list";
    }
}