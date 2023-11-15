package com.example.bai_2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("")
    public String getTimeByTimezone(@RequestParam (name = "city",required = false,defaultValue = "Asia/Ho_Chi_Minh")String city, Model model){
        Date date = new Date();
        TimeZone timeZone = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long localeTime = date.getTime()+(locale.getRawOffset()- timeZone.getRawOffset());
        date.setTime(localeTime);
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        return "/index";
    }
}
