package se.project.add_to_cart_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.project.add_to_cart_project.Entity.CartitemFind;

public interface CartItemFindRepo extends JpaRepository<CartitemFind, Integer>{
    
}
