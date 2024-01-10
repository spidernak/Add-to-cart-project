package se.project.add_to_cart_project.Model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class Registration {
    @GetMapping("/Registration")
    public String registrationpage(){
        return "Registration";
    }
    @GetMapping("/buylist")
    public String BuyListpage() {
        return "BuyList";
    }

    @GetMapping("/Insert")
    public String product() {
        return "InsertPage";
    }
    @GetMapping("/Payment")
    public String Payment() {
        return "PaymentPage";
    }
    
}
