package com.example.bai_tap_1.controller;


import com.example.bai_tap_1.model.Book;
import com.example.bai_tap_1.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping("")
    public String showListBook(Model model) {
        List<Book> bookList = bookService.findAll();
        model.addAttribute("books", bookList);
        return "list";
    }

    @GetMapping( "/{id}/detail")
    public String showDetailBook(Model model, @PathVariable int id) {
        model.addAttribute("book", bookService.findById(id));
        return "detail";
    }

    @PostMapping( "/{id}/borrow")
    public String borrowBook(@ModelAttribute Book book, @PathVariable int id, RedirectAttributes redirectAttributes) {
        long code = bookService.generateBorrowCode();
        bookService.borrowBook(id, code);
        redirectAttributes.addFlashAttribute("message", "Đã mượn sách thành công với mã số là: " + code);
        return "redirect:/book";
    }
}
