package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.model.Blog;
import com.example.bai_tap_1.model.Category;
import com.example.bai_tap_1.service.IBlogService;
import com.example.bai_tap_1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
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
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String list(@RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String searchName,
                       Model model) {
        Pageable pageable = PageRequest.of(page, 3, Sort.by("blog_name").ascending()
                .and(Sort.by("category_id").descending()));
        Page<Blog> blogPage = blogService.findAll(searchName, pageable);
        model.addAttribute("blogPage", blogPage);
        model.addAttribute("searchName", searchName);
        return "views/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
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
        List<Category> categories = categoryService.findAll();
        model.addAttribute("categories", categories);
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
    public String delete(int id, RedirectAttributes redirectAttributes) {
        blogService.delete(id);
        redirectAttributes.addFlashAttribute("message", " delete product successfully");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/detail")
    public String showFormDetail(@PathVariable int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "views/detail";
    }
}