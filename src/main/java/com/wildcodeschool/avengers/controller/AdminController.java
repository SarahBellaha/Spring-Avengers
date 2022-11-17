package com.wildcodeschool.avengers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/secret-bases")
    public String cities(Model model){
        String[] cities = {"Biarritz", "Bordeaux", "La Loupe", "Lille", "Lyon", "Marseille", "Nantes",
                "Orléans", "Paris", "Reims", "Strasbourg", "Toulouse", "Tours"};

        model.addAttribute("cities", cities);
        return "cities";
    }

}
