package se.project.add_to_cart_project.Repository;

import se.project.add_to_cart_project.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;




public interface UserRepository extends JpaRepository<User, Long>{
     User findByUserName(String userName);

}
