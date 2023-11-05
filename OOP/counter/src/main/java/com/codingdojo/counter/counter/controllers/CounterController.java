package com.codingdojo.counter.counter.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {
    
    @RequestMapping("/")
    public String index(HttpSession session){
        if(session.getAttribute("count") == null){
            session.setAttribute("count", 0);
        }
        else {
            int number = (int) session.getAttribute("count");
            number++;
            session.setAttribute("count", number);
        }
        return "index.jsp";
    }

    @RequestMapping("/counter")
    public String counter(HttpSession session){
        return "counter.jsp";
    }

}
