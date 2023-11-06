package com.codingdojo.burger_tracker.controllers;

import java.util.List;

import jakarta.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.burger_tracker.models.Burger;
import com.codingdojo.burger_tracker.services.BurgerService;



@Controller
public class BurgerController {
    @Autowired
    BurgerService burgerService;

    @GetMapping("/")
    public String home(@ModelAttribute("burger") Burger burger, Model model){
        List<Burger> burgers = burgerService.allBurgers();
        model.addAttribute("burgers", burgers);
        return "index.jsp";
    }

    @PostMapping("/addBurger")
    public String home(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model ){
        if(result.hasErrors()){
            List<Burger> burgers = burgerService.allBurgers();
            model.addAttribute("burgers", burgers);
            return "index.jsp";
        }
        burgerService.addBurger(burger);
        return "redirect:/";
    }

    

}
