// package se.project.add_to_cart_project.Model;


// import java.util.List;

// import org.springframework.boot.CommandLineRunner;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// @Configuration
// public class DatabaseLoader {
//     private UserRepository repo;

//     public DatabaseLoader(UserRepository repo) {
//         this.repo = repo;
//     }

//     @Bean
//     public CommandLineRunner initializeDAtabase(){
//         return args -> {
//             User user1 = new User("admin@gmail.com", "12345", Role.ADMIN);
//             User user2 = new User("user2gmail.com", "12345", Role.USER);
//             User user3 = new User("user3@gmail.com", "12345", Role.USER);
//             repo.saveAll(List.of(user1,user2,user3));
//             System.out.println("Add user to database");
//         };
//     }
// }
