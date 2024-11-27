package com.directmart.directmart.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index(){
        System.out.println("Hello World");
        return "index";
    }
}
