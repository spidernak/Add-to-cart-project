package se.project.add_to_cart_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.project.add_to_cart_project.Entity.CartItem;
import se.project.add_to_cart_project.Repository.CartItemRepository;

@Service
public class CartItemService {
    
    @Autowired

    private CartItemRepository cir;

    public List<CartItem> getAllCartitem(){
        return cir.findAll();
    }

    public Optional<CartItem> getCartItemById(Long id){
        return cir.findById(id);
    }
}
