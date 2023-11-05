package com.hellohuman.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {

    @RequestMapping("/")
    public String index(@RequestParam(value="name", required=false) String searchQuery) {
        if(searchQuery == null){
            System.out.println(searchQuery);
            return "Hello Human!";
        }
        else{
            System.out.println(searchQuery);
            return "Hello " +  searchQuery + "!";
        }
    }
    
}



