package com.example.bazaar;

import com.example.bazaar.entity.User;
import com.example.bazaar.entity.shareDetail;
import com.example.bazaar.repository.shareDetailsRepository;
import com.example.bazaar.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BazaarApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(BazaarApplication.class, args);
    }


    @Autowired
    PasswordEncoder encoder;

    @Autowired
    shareDetailsRepository shareRepo;

    @Autowired
    userRepository userRepo;

    @Override
    public void run(String... args) throws Exception {

        userRepo.deleteAll();
        shareRepo.deleteAll();

//        User user3 = new User("SutharChirag", "Chirag", "Suthar", "ChiR@g.$uTh@r", "sutharchirag128@gmail.com");
//        user3.setPassword(encoder.encode(user3.getPassword()));
//        userRepo.save(user3);
        User user4 = new User("Chirag", "Suthar", "Chirag", "chiragsuthar", "sutharchirag129@gmail.com");
        user4.setPassword(encoder.encode(user4.getPassword()));
        userRepo.save(user4);

//        User user5 = new User("chiragsuthar", "Chirag", "Suthar", "chiragsuthar", "sutharchirag128@gmail.com");
//        user5.setPassword(encoder.encode(user5.getPassword()));
//        userRepo.save(user5);
//        User user6 = new User("bnb", "Suthar", "Chirag", "bnb", "sutharchirag129@gmail.com");
//        user6.setPassword(encoder.encode(user6.getPassword()));
//        userRepo.save(user6);



//        shareDetail share = new shareDetail("comp1", 24D);
//        shareRepo.save(share);
//        shareDetail share1 = new shareDetail("comp2", 242D);
//        shareRepo.save(share1);
//        shareDetail share2 = new shareDetail("comp3", 241D);
//        shareRepo.save(share2);

//        User user = new User("Riddhi1", "Riddhi", "Riddhi", "Riddhi", "bullsandbears@gmail.com");
//        User user1 = new User("Riddhi2", "Riddhi", "Riddhi", "Riddhi", "bullsandbears@gmail.com");
//        User user2 = new User("Nikhil", "Nikhil", "Nikhil", "Nikhil", "bullsandbears@gmail.com");
//        User user3 = new User("Nikhil2", "Nikhil", "Nikhil", "Nikhil", "bullsandbears@gmail.com");
//        User user4 = new User("Anika", "Nikhil", "Nikhil", "Anika", "bullsandbears@gmail.com");
//        User user5 = new User("Hemang", "Nikhil", "Nikhil", "Hemang", "bullsandbears@gmail.com");
//        User user6 = new User("Pragya", "Nikhil", "Nikhil", "Pragya", "bullsandbears@gmail.com");
//        User user7 = new User("Vashisth", "Nikhil", "Nikhil", "Vashisth", "bullsandbears@gmail.com");
//        User user8 = new User("Nikisha", "Nikhil", "Nikhil", "Nikisha", "bullsandbears@gmail.com");
//        User user9 = new User("Avnee", "Nikhil", "Nikhil", "Avnee", "bullsandbears@gmail.com");
//        User user10 = new User("Nikhil", "Nikhil", "Nikhil", "Nikhil", "bullsandbears@gmail.com");
//        User user11 = new User("Ishaan2", "Nikhil", "Nikhil", "Ishaan", "bullsandbears@gmail.com");
//        User user12 = new User("Riddhi2", "Nikhil", "Nikhil", "Riddhi", "bullsandbears@gmail.com");
//        User user13 = new User("Vashishth2", "Nikhil", "Nikhil", "Vashishth", "bullsandbears@gmail.com");
//        User user14 = new User("Bhavya2", "Nikhil", "Nikhil", "Bhavya", "bullsandbears@gmail.com");





//        user.setPassword(encoder.encode(user.getPassword()));
//        user1.setPassword(encoder.encode(user1.getPassword()));
//        user2.setPassword(encoder.encode(user2.getPassword()));
//        user3.setPassword(encoder.encode(user3.getPassword()));
//        user4.setPassword(encoder.encode(user4.getPassword()));
//        user5.setPassword(encoder.encode(user5.getPassword()));
//        user6.setPassword(encoder.encode(user6.getPassword()));
//        user7.setPassword(encoder.encode(user7.getPassword()));
//        user8.setPassword(encoder.encode(user8.getPassword()));
//        user9.setPassword(encoder.encode(user9.getPassword()));
//        user10.setPassword(encoder.encode(user10.getPassword()));
//        user11.setPassword(encoder.encode(user11.getPassword()));
//        user12.setPassword(encoder.encode(user12.getPassword()));
//        user13.setPassword(encoder.encode(user13.getPassword()));
//        user14.setPassword(encoder.encode(user14.getPassword()));

//        userRepo.save(user);
//        userRepo.save(user1);
//        userRepo.save(user2);
//        userRepo.save(user3);
//        userRepo.save(user4);
//        userRepo.save(user5);
//        userRepo.save(user6);
//        userRepo.save(user7);
//        userRepo.save(user8);
//        userRepo.save(user9);
//        userRepo.save(user10);
//        userRepo.save(user11);
//        userRepo.save(user12);
//        userRepo.save(user13);
//        userRepo.save(user14);



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
