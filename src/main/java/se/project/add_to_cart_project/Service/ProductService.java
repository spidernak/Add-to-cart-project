package se.project.add_to_cart_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.project.add_to_cart_project.Entity.Product;
import se.project.add_to_cart_project.Repository.ProductRepository;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository proRepo;

    public List<Product> getAllProducts(){
        return proRepo.findAll();
    }

    public void save(Product product){
        proRepo.save(product);
    }

    public Optional<Product> getProductById(Long id){
        return proRepo.findById(id);
    }

    public void deleteProductById(Long id){
        proRepo.deleteById(id);
    }
}
