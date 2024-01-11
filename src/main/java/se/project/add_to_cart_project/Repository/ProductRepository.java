package se.project.add_to_cart_project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import se.project.add_to_cart_project.Entity.Product;
import java.util.List;
import java.util.Optional;


public interface ProductRepository extends JpaRepository<Product, Long>{
   List<Product> findByName(String name); 
}
