package se.project.add_to_cart_project.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Registration {
    // @GetMapping("/Registration")
    // public String registrationpage(){
    //     return "Registration";
    // }
    
    @GetMapping("/homepagelist")
    public String homepage(){
        return "Homepagelist";
    }
<<<<<<< HEAD
    
     @GetMapping("/viewdetail")
    public String viewdetail(){
        return "viewproduct";
    }

     @GetMapping("/viewcarted")
    public String viewcarted(){
        return "viewcarted";
    }
    
    
=======

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
>>>>>>> 9ca40f2c86db870b124bb5f88c65fa846c0226b8
}
