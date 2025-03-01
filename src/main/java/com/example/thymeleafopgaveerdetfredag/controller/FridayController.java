package com.example.thymeleafopgaveerdetfredag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;

@Controller
public class FridayController {

    @GetMapping ("/friday")
    public String checkFriday(Model model){
        String dayOfTheWeek = LocalDate.now().getDayOfWeek().name(); /** Get the current day of the week **/
        model.addAttribute("weekday", dayOfTheWeek);
        return "friday";
    }
}
