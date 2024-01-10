package se.project.add_to_cart_project.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import se.project.add_to_cart_project.Entity.Product;
import se.project.add_to_cart_project.Entity.User;
import se.project.add_to_cart_project.Service.UserService;



@Controller
// @RequestMapping("/main")


public class UserController {
    @Autowired
    private UserService service;

    @GetMapping("/Log_In")
    public String Log_In() {
        return "SignIn";
    }
    @GetMapping("/Admin")
    public String BuyList(){
        return "AdminHome";
    }
    @GetMapping("/Homepage")
    public String Homepagelist(){
        return "Homepagelist";
    }


    
    @PostMapping("/Log_In")
    public String login(HttpServletRequest request, HttpSession session) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");

        User authenticatedUser = service.authenticateUser(userName, password);

        if (authenticatedUser != null) {
            // Store the authenticated user in the session
            session.setAttribute("authenticatedUser", authenticatedUser);

            if ("admin".equals(authenticatedUser.getRole())) {
                return "redirect:/Admin";
            } else if ("user".equals(authenticatedUser.getRole())) {
                return "redirect:/Homepage";
            }
        } else {
            // Add error message attribute to be displayed in the login page
            request.setAttribute("LogInError", "Invalid username or password!");
            return "SignIn";
        }
        return "redirect:/";
    }
    @GetMapping("/SignUp")
        public String signUp(){
            return "SignUp";
        }
    @PostMapping("/SignUp")
    public String register(HttpServletRequest request, Model model) {
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        // Check if the username already exists in the database
        if (service.alreadyExists(userName)) {
            request.setAttribute("RegisterError", "Username already exists!");
            return "SignUp";
        }

        // Check if password and confirm password match
        // if (!password.equals(confirmPassword)) {
        //     request.setAttribute("RegisterError", "Passwords do not match!");
        //     return "SignIn";
        // }

        // Save the user to the database or perform other registration logic
        User newUser = new User();
        newUser.setUsername(userName);
        newUser.setPassword(password);
        
        newUser.setEmail(email);
         // You may set the role as needed
        newUser.setRole("user");
        service.save(newUser);

        // Add the success message to the Thymeleaf model
        // model.addAttribute("SuccessMessage", "User has been successfully created!");

        // Redirect to the login page after successful registration
        return "SignIn";
    }

     @GetMapping("/viewdetail")
        public String viedetail(){
            return "viewproduct";
        }





@GetMapping("/User_List")
public String User_List(Model model, HttpSession session) {
    // Check if the user is authenticated
    if (session.getAttribute("authenticatedUser") == null) {
        // Redirect to the login page if not authenticated
        return "redirect:/Homepagelist";
    }

    // Check the role of the authenticated user
    User authenticatedUser = (User) session.getAttribute("authenticatedUser");
    if (!"admin".equals(authenticatedUser.getRole())) {
        // Redirect to the appropriate home page based on the user's role
        if ("user".equals(authenticatedUser.getRole())) {
            return "redirect:/Homepagelist";
        }
    }

    // Fetch all users from the database
    List<User> userList = service.getAllUsers();

    // Add the user list to the Thymeleaf model
    // model.addAttribute("userList", userList);

    return "UserList";
}


    
    
}
