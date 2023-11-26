package com.example.bai_tap_2.controller;

import com.example.bai_tap_2.dto.SongDto;
import com.example.bai_tap_2.model.Song;
import com.example.bai_tap_2.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.AbstractBindingResult;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(value = "/song")
public class SongController {
    @Autowired
    private ISongService songService;

    @GetMapping("")
    public String showList(Model model){
        List<Song> songList = songService.getAll();
        model.addAttribute("songList", songList);
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("songDto", new SongDto());
        return "create";
    }

    @PostMapping("/create")
    public String create(@Valid @ModelAttribute SongDto songDto, BindingResult bindingResult,
                         RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "create";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        songService.addNewSong(song);
        redirectAttributes.addFlashAttribute("mess","create successfully ");
        return "redirect:/song";
    }

    @GetMapping("/{id}/update")
    public String showFormUpdate(@PathVariable int id, Model model){
        SongDto songDto = new SongDto();
        Song song = songService.findById(id);
        BeanUtils.copyProperties(song,songDto);
        model.addAttribute("songDto", songDto);
        return "update";
    }

    @PostMapping("update")
    public String update(@Valid @ModelAttribute SongDto songDto,
                         BindingResult bindingResult, RedirectAttributes redirectAttributes){
        if(bindingResult.hasErrors()){
            return "update";
        }
        Song song = new Song();
        BeanUtils.copyProperties(songDto,song);
        songService.addNewSong(song);
        redirectAttributes.addFlashAttribute("mess","update successfully");
        return "redirect:/song";
    }
}
