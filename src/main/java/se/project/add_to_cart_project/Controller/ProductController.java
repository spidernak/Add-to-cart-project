package se.project.add_to_cart_project.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import ch.qos.logback.core.model.Model;
import se.project.add_to_cart_project.Service.ProductService;
import se.project.add_to_cart_project.Entity.Product;



@Controller
public class ProductController {
    @Autowired
    // private AddToCartService addToCartService;
    private ProductService service;

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


    
    
    // @GetMapping("/productdetail")
    // public String Homepagelist(org.springframework.ui.Model m){

    //     m.addAttribute("products", pr.findAll());
    //     return "viewproduct";
    // }

    @GetMapping("/carted")
        public String viewcarted(){
            return "viewcarted";
        }
    
}

