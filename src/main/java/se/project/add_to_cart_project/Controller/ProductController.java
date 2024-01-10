package se.project.add_to_cart_project.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
        String price = request.getParameter("price");
        
        String description = request.getParameter("description");

        Product newProduct = new Product();
        newProduct.setName(ProductName);
        newProduct.setPrice(price);
        newProduct.setImage(image);
        newProduct.setDescription(description);

        service.save(newProduct);


        return "InsertProduct";
        
    }
}
