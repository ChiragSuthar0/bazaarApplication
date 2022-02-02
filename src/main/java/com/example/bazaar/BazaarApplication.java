package com.example.bazaar;

import com.example.bazaar.entity.User;
import com.example.bazaar.entity.shareDetail;
import com.example.bazaar.repository.shareDetailsRepository;
import com.example.bazaar.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BazaarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BazaarApplication.class, args);
    }

    @Autowired
    shareDetailsRepository shareRepo;

    @Autowired
    userRepository userRepo;

    @Override
    public void run(String... args) throws Exception {

//        userRepo.deleteAll();
//        shareRepo.deleteAll();

//        User user3 = new User("SutharChirag", "Chirag", "Suthar", "ChiR@g.$uTh@r", "sutharchirag128@gmail.com");
//        userRepo.save(user3);
//        User user4 = new User("Chirag", "Suthar", "Chirag", "chiragsuthar", "sutharchirag129@gmail.com");
//        userRepo.save(user4);

//        User user5 = new User("chiragsuthar", "Chirag", "Suthar", "chiragsuthar", "sutharchirag128@gmail.com");
//        userRepo.save(user5);
//        User user6 = new User("bnb", "Suthar", "Chirag", "bnb", "sutharchirag129@gmail.com");
//        userRepo.save(user6);



//        shareDetail share = new shareDetail("comp1", 24D);
//        shareRepo.save(share);
//        shareDetail share1 = new shareDetail("comp2", 242D);
//        shareRepo.save(share1);
//        shareDetail share2 = new shareDetail("comp3", 241D);
//        shareRepo.save(share2);

//        User user = new User("President", "Avnee", "Satija", "BnbPresident", "bullsandbears@gmail.com");
//        user.setRole("ROLE_ADMIN");
//        userRepo.save(user);

//        User user1 = new User("GenSec", "Anika", "Dhadhich", "BnbGenSec", "bullsandbears@gmail.com");
//        user1.setRole("ROLE_ADMIN");
//        userRepo.save(user1);

//        User user2 = new User("VicePresident", "Vashisth", "Doshi", "BnbVicePresident", "bullsandbears@gmail.com");
//        user2.setRole("ROLE_ADMIN");
//        userRepo.save(user2);


//        shareDetail share = new shareDetail("ICICI Bank", 2D);
//        shareRepo.save(share);
//        shareDetail share1 = new shareDetail("Cadilla Healthcare", 2D);
//        shareRepo.save(share1);
//        shareDetail share2 = new shareDetail("Nestle India", 2D);
//        shareRepo.save(share2);
//        shareDetail share3 = new shareDetail("Infosys", 2D);
//        shareRepo.save(share3);
//        shareDetail share4 = new shareDetail("Airtel", 2D);
//        shareRepo.save(share4);
//        shareDetail share5 = new shareDetail("L & T", 2D);
//        shareRepo.save(share5);
//        shareDetail share6 = new shareDetail("Reliance", 2D);
//        shareRepo.save(share6);
//        shareDetail share7 = new shareDetail("Adani Green", 2D);
//        shareRepo.save(share7);

    }
}
