package com.example.bai_1.controller;

import com.example.bai_1.model.Mailbox;
import com.example.bai_1.repository.IMailboxRepository;
import com.example.bai_1.serviece.IMailboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/mailbox")
public class MailboxController {
    @Autowired
    private IMailboxService mailboxService;

    @GetMapping("")
    public String showMailbox(Model model){
        Mailbox mailbox = mailboxService.getMailbox();
        model.addAttribute("mailbox",mailbox);
        return "/mailbox";
    }
    @GetMapping("/setting")
    public String showForm(Model model) {
        Mailbox mailbox = mailboxService.getMailbox();
        model.addAttribute("languages", new String[]{"English", "Vietnamese", "Japanese", "Chinese"});
        model.addAttribute("pageSize", new String[]{"5", "10", "15", "25", "100"});
        model.addAttribute("mailbox", mailbox);
        return "/create";
    }

    @PostMapping("/setting")
    public String update(@ModelAttribute Mailbox mailbox,
                         Model model) {
        mailboxService.update(mailbox);
        model.addAttribute("mes", "updated successfully");
        return "/mailbox";
    }
}
