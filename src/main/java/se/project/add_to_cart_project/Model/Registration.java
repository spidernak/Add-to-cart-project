package se.project.add_to_cart_project.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;



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

    
     @GetMapping("/viewdetail")
    public String viewdetail(){
        return "viewproduct";
    }

     @GetMapping("/viewcarted")
    public String viewcarted(){
        return "viewcarted";
    }
    
    


    @GetMapping("/signInUser")
    public String SignUser(){
        return "SignInUser";
    }
    
    @PostMapping("/signInUser/login")
    public String authenticate(@ModelAttribute User u ){
        if(u.getEmail().equals("abc@gmail.com") && u.getPassword().equals("123")){
            return "Homepagelist";
        }
        return "index";
    }

    @PostMapping("/singInadmin/login")
    public String administrator(@ModelAttribute Admin a){
        if(a.getEmail().equals("admin@gmail.com") && a.getPassword().equals("12345")){
            return "viewproduct";
        }
        return "SignInAdmin";
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
