package com.directmart.directmart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.directmart.directmart.model.User;
import com.directmart.directmart.repository.Repository;
import org.springframework.web.bind.annotation.PostMapping;





@Controller
public class HomeController {
    @Autowired
    private Repository repo;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @PostMapping("save")
    public String postMethodName(@ModelAttribute User user) {
        repo.save(user);
        
        return "redirect:/index" ;
    }
    
}
