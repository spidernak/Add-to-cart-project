package se.project.add_to_cart_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.project.add_to_cart_project.Entity.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long>{
        //@Query("SELECT c FROM CartItem c WHERE c.product = ?1")
}
