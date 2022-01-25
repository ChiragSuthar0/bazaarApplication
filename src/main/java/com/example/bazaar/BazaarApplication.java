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

//        User user = new User("SutharChirag", "Chirag", "Suthar", "ChiR@g.$uTh@r", "sutharchirag128@gmail.com", 15000D);
//        userRepo.save(user);
//        User user2 = new User("Chirag", "Suthar", "Chirag", "chiragsuthar", "sutharchirag129@gmail.com", 15000D);
//        userRepo.save(user2);


//        shareDetail share = new shareDetail("comp1", 24D);
//        shareRepo.save(share);
//        shareDetail share1 = new shareDetail("comp2", 242D);
//        shareRepo.save(share1);
//        shareDetail share2 = new shareDetail("comp3", 241D);
//        shareRepo.save(share2);
    }
}
