package se.project.add_to_cart_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.project.add_to_cart_project.Entity.Cart;

public interface CartRepository extends JpaRepository<Cart, Long>{
        //@Query("SELECT c FROM Cart c WHERE c.user = ?1")
}
