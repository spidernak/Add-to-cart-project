package se.project.add_to_cart_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.project.add_to_cart_project.Entity.Cart;
import se.project.add_to_cart_project.Repository.CartRepository;

@Service
public class CartService {
    
    @Autowired
     private CartRepository cr;
    
     public List<Cart>getAllCarts(){
        return cr.findAll();
     }

     public Optional<Cart> getCartById(Long id){
        return cr.findById(id);
     }
}

