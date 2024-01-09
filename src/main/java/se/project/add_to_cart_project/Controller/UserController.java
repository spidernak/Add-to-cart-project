// package se.project.add_to_cart_project.Controller;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// import jakarta.servlet.http.HttpServletRequest;
// import jakarta.servlet.http.HttpSession;
// import se.project.add_to_cart_project.Entity.User;
// import se.project.add_to_cart_project.Service.UserService;



// @Controller
// @RequestMapping("/main")


// public class UserController {
//     @Autowired
//     private UserService service;

//      @GetMapping("/Log_in")
//     public String LogIn() {
//         return "SignInAdmin";
//     }
//     @PostMapping("/Log_in")
//     public String login(HttpServletRequest request, HttpSession session) {
//         String userName = request.getParameter("username");
//         String password = request.getParameter("password");

//         User authenticatedUser = service.authenticateUser(userName, password);

//         if (authenticatedUser != null) {
//             // Store the authenticated user in the session
//             session.setAttribute("authenticatedUser", authenticatedUser);

//             if ("admin".equals(authenticatedUser.getRole())) {
//                 return "redirect:/main/adminpage";
//             } else if ("user".equals(authenticatedUser.getRole())) {
//                 return "redirect:/main/Homepagelist";
//             }
//         } else {
//             // Add error message attribute to be displayed in the login page
//             request.setAttribute("LogInError", "Invalid username or password!");
//             return "Register";
//         }
//         return "redirect:/";
//     }

// }
