package se.project.add_to_cart_project.Controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import ch.qos.logback.core.model.Model;
import se.project.add_to_cart_project.Service.ProductService;
import se.project.add_to_cart_project.Entity.Product;
import se.project.add_to_cart_project.Repository.CartItemRepository;
import se.project.add_to_cart_project.Repository.CartRepository;
import se.project.add_to_cart_project.Repository.ProductRepository;
import se.project.add_to_cart_project.Repository.UserRepository;



@Controller
public class ProductController {
    @Autowired
    // private AddToCartService addToCartService;
    private ProductService service;

    @Autowired
    private ProductRepository pr;

    @Autowired
    private CartItemRepository cip;

    @Autowired
    private CartRepository cr;


    @GetMapping("/productdetail")
    public String detailpro(){
        return "viewproduct";
    }

    @GetMapping("/insertproduct")
    public String insertproduct(){
        return "InsertProduct";
    }
    @PostMapping("insertproduct")
    public String insertproduct(HttpServletRequest request, Model model){
        String ProductName = request.getParameter("ProductName");
        String image = request.getParameter("image");
        String size = request.getParameter("size");
        String color = request.getParameter("color");
        String price = request.getParameter("price");
        
        String description = request.getParameter("description");

        Product newProduct = new Product();
        newProduct.setName(ProductName);
        newProduct.setSize(size);
        newProduct.setColor(color);
        newProduct.setImage(image);
        newProduct.setPrice(price);
        newProduct.setDescription(description);

        service.save(newProduct);


        return "InsertProduct";
        
    }


    @GetMapping("/carted")
        public String viewcarted(){
            return "viewcarted";
        }
    // @GetMapping("/productdetail/{id}")
    // public String productdetail(org.springframework.ui.Model m, @ModelAttribute Product pro, @PathVariable("id") Long id){
        
    //     m.addAttribute("product",  pr.findById(id));
    //     return "viewproduct";
    // }
    @GetMapping("/productdetail/{id}")
    public String productdetail(@PathVariable("id") Long id ,org.springframework.ui.Model m){
        Optional<Product> products = pr.findById(id);
        Product p = products.orElse(null);
        m.addAttribute("items", p);

        return "viewproduct";
    }


    
}  

