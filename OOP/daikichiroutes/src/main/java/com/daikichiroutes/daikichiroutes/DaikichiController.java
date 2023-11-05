package com.daikichiroutes.daikichiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
    
    @RequestMapping("")
    public String first() {
        return "Welcome!";
    }

    @RequestMapping("/today")
    public String second(){
        return "Today you will find luck in your endeavors!";
    }

    @RequestMapping("/tomorrow")
    public String third(){
        return ("Tomorrow, an opportunity will arise, so be sure to be open to new ideas!");
    }
}
