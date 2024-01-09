package se.project.add_to_cart_project.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Registration {
    @GetMapping("/Registration")
    public String registrationpage(){
        return "Registration";
    }

    @GetMapping("/signInUser")
    public String SignUser(){
        return "SignInUser";
    }
    @GetMapping("/SignUp")
    public String SignUp(){
        return "SignUp";
    }
    @GetMapping("/signinadmin")
    public String SignAdmin(){
        return "SignInAdmin";
    }
    @GetMapping("/register")
    public String Sign(){
        return "Register";
    }
}
