package com.codingdojo.dojos_and_ninjas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.dojos_and_ninjas.models.Dojo;
import com.codingdojo.dojos_and_ninjas.models.Ninja;
import com.codingdojo.dojos_and_ninjas.services.DojoService;
import com.codingdojo.dojos_and_ninjas.services.NinjaService;

@Controller
public class HomeController {
    
    @Autowired
    DojoService dojoService;

    @Autowired
    NinjaService ninjaService;

    @GetMapping("/dojos/new")
    public String newDojo(@ModelAttribute Dojo dojo){
        return "dojos/newDojo";
    }
    
    @PostMapping("/dojo")
    public String createDojo(@ModelAttribute Dojo dojo){
        Dojo newDojo = dojoService.addDojo(dojo);
        return String.format("redirect:/dojos/%d",newDojo.getId());
    }
    
    @GetMapping("/ninjas/new")
    public String newNinja(@ModelAttribute Ninja ninja,Model model){
        List<Dojo> dojos = dojoService.allDojos();
        model.addAttribute("dojos",dojos);
        return "ninjas/newNinja";
    }

    @PostMapping("/ninjas")
    public String createNinja(@ModelAttribute Ninja ninja){
    Ninja newNinja = ninjaService.addNinja(ninja);
    return String.format("redirect:/dojos/%d",newNinja.getDojo().getId());
    }

    @GetMapping("/dojos/{id}")
    public String showDojo(@PathVariable Long id, Model model){
        Dojo dojo = dojoService.findDojo(id);
        List<Ninja> ninjas = dojo.getNinjas();
        model.addAttribute("dojo", dojo);
        model.addAttribute("ninjas", ninjas);
        return "dojos/show";
    }
}
