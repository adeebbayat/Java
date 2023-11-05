package com.codingdojo.omikuji_form.omikuji_form.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class OmikujiFormController {
    
    @GetMapping("/omikuji")
    public String index(){
        return "index.jsp";
    }

    @PostMapping("/submit")
    public String submit(
        @RequestParam(value="number") int number,
        @RequestParam(value="city") String city,
        @RequestParam(value="person") String person,
        @RequestParam(value="hobby") String hobby,
        @RequestParam(value="living") String living,
        @RequestParam(value="somethingNice") String somethingNice,
        HttpSession session){

            session.setAttribute("number",number);
            session.setAttribute("city", city);
            session.setAttribute("person",person);
            session.setAttribute("hobby", hobby);
            session.setAttribute("living", living);
            session.setAttribute("somethingNice", somethingNice);

            return "redirect:/omikuji/show";
        }
    
    @GetMapping("/omikuji/show")
    public String show(){
        return "show.jsp";
    }
    
}
