package se.project.add_to_cart_project.Model;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface UserRepository extends CrudRepository<User, Integer>{
    public List<User> findByEmail(String email);
}
