package se.project.add_to_cart_project.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import se.project.add_to_cart_project.Entity.User;
import se.project.add_to_cart_project.Repository.UserRepository;

@Service
public class UserService {
     @Autowired
   private UserRepository userRepo;

   // public User authenticateUser(String userName, String password) {
   //    User user = userRepo.findByUserName(userName);

   //    if (user != null && user.getPassword().equals(password)) {
   //        return user;
   //    }

   //    return null;
   // }

   // public boolean alreadyExists(String username) {
   //    return userRepo.findByUserName(username) != null;
   // }

   public Optional<User> getUserById(Long id) {
      return userRepo.findById(id);
   } 
  
   public void save(User user) {
      userRepo.save(user);
   }

   public List<User> getAllUsers(){
      return userRepo.findAll();
   }

   public void deleteUserById(Long id) {
      userRepo.deleteById(id);
   }
}
