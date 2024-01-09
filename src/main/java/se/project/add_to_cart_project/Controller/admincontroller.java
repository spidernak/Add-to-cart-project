package se.project.add_to_cart_project.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class admincontroller {
    
    @GetMapping("")
    public String loginform(){
        return "index";
    }
    
}
