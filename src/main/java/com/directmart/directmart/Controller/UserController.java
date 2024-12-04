package com.directmart.directmart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.directmart.directmart.model.User;
import com.directmart.directmart.service.UserServiceimp;

@Controller
public class UserController {

    @Autowired
    private UserServiceimp userService;

    // Show the login and registration form
    @GetMapping("/")
    public String showForm(Model model) {
        model.addAttribute("user", new User()); // Use the model object to add attributes
        return "sucess"; // The HTML file name (without extension)
    }


    // Show the login form
    @GetMapping("/login")
    public String login(Model model) {
        model.addAttribute("user", new User()); // Use the model object to add attributes
        return "index"; // The HTML file name (without extension)
    }    

    // Handle user login
    @PostMapping("/login")
    public String loginUser(@RequestParam String email, 
                            @RequestParam String password, 
                            Model model) {
        boolean isAuthenticated = userService.authenticate(email, password);
        if (isAuthenticated) {
            return "redirect:/dashboard"; // Redirect to the dashboard if authentication is successful
        } else {
            model.addAttribute("error", "Invalid email or password");
            return "index"; // Stay on the login page if authentication fails
        }
    }

    // Show the registration form
    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("user", new User()); // Use the model object to add attributes
        return "index"; // The HTML file name (without extension)
    }    

    // Handle user registration
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user, Model model) {
        userService.saveUser(user); // Save the user to the database
        model.addAttribute("message", "Registration successful! Please log in.");
        return "index"; // Stay on the same page after registration
    }
 
}

