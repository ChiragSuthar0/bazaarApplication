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


//        User user1 = new User("<avnee>", "<Avnee >", "<Satija>", "<avnee123>", "<avnee.sbb19@sls.pdpu.ac.in>");
//
//        User user2 = new User("<anika>", "<Anika>", "<Dadhich>", "<anika123>", "<anika.dbb19@sls.pdpu.ac.in>");
//
//
//
//        User user7 = new User("Aashna", "Diya", "Desai", "aashna13","diyaseju@gmail.com");
//
//        User user8 = new User("devdalia9", "Dev", "Dalia", "1234567", "devdalia9@gmail.com");
//
//        User user9 = new User("Rahi30", "Rahi ", "Mehta", "Rahi3030", "rahi.mehta007@gmail.com");
//
//
//
//        User user10 = new User("HemangSharma", "Hemang", "Sharma", "Hemang9726", "hemangsharma111@gmail.com");
//
//        User user11 = new User("tanish26", "Tanish", "Mukherjee", "Tnsh12@26", "tanish.mbcom20@sls.pdpu.ac.in");
//
//        User user12 = new User("aashishkodi", "Aashish", "Kodi", "6h6f30j3", "aashishkodi10@gmail.com");
//
//        User user13 = new User("TVS$$", "Tirth", "Shah", "Tirthshah18!", "tirth4uall@gmail.com");
//
//        User user14 = new User("bhavyakotak", "bhavya", "kotak", "bhavyakotak", "bhavyakotak2@gmail.com");
//
//
//
//        User user15 = new User("Naitik patel", "Naitik", "Patel", "9737872224", "naitikpatel14600@gmail.com");
//
//        User user16 = new User("ananya Chaturvedi", "ananya", "chaturvedi", "ananya@1234", "ananya.cbb20@sls.pdpu.ac.in");
//
//
//
//        User user17 = new User("Adarshsingh Thakur", "Adarshsingh", "Thakur", "Adarsh0000", "21babba094@sls.pdpu.ac.in");
//
//
//        User user210 = new User("<TVS$$$>", "<Tirth>", "<Shah>", "<Tirthshah18!>", "<tirth4uall@gmail.com>");
//
//        User user18 = new User("patrikx", "Prateek", "Mundhra", "1234567890", "ptkmundhra4@gmail.com");
//
//        User user19 = new User("nik", "Nikhil", "Agarwal", "nik123", "nikhilagarwal234dk@gmail.com");
//
//        User user20 = new User("<your Username>", "<Your First Name>", "<Your Last Name>", "<Your Password>", "<Your Gmail ID>");
//
//        User user21 = new User("Meg", "Megha", "Mistry", "meg31", "megha.mistry2002@gmail.com");
//
//
//        User user22 = new User("<sam>", "<samvit>", "<rangani>", "<samvit12345678>", "<21babba097@sls.pdpu.ac.in>");
//
//        User user23 = new User("Manav3012", "Manav", "Sanghvi", "Manav002","manav.sce20@sot.pdpu.ac.in");
//
//        User user24 = new User("vanshika123", "Vanshika", "Chitre", "vc179", "21bco123@sls.pdpu.ac.in");
//
//        User user25 = new User ("riddhi123" , "Riddhi", "Ramchandani", "r123", "riddhi.rbb20@sls.pdpu.ac.in");
//
//        User user26 = new User("Doi07", "Ishaan","doi",  "12345", "ishaan.dbb19@sls.pdpu.ac.in");
//
//        User user27 = new User("harshilbhatt_", "Harshil", "Bhatt", "1234567", "harshilbhatt8198@gmail.com");
//
//
//        User user28= new User("avani", "Avani"," Firke",  "AvaniF24", "21BABBA114@sls.pdpu.ac.in");
//
//
//        User user29 = new User("<Dhruv19>", "<dhruv>", "<Gandecha>", "<1234#1234>", "<dhruv.gbb19@sls.pdpu.ac.in>");
//
//
//        User user30 = new User("MSD", "Malay", "Damani", "12345678", "damanimalay@gmail.com");
//
//        User user31 = new User("BhavyaPatel", "Bhavya", "Patel", "Bhavya1234", "mebhavya26@gmail.com");
//
//        User user32=new User("pancham123","pancham","vashi","<vashi123>","Pancham.vashi@gmail.com");
//
//
//
//
//
//
//
//
////        user.setPassword(encoder.encode(user.getPassword()));
//        user1.setPassword(encoder.encode(user1.getPassword()));
//        user2.setPassword(encoder.encode(user2.getPassword()));
////        user3.setPassword(encoder.encode(user3.getPassword()));
////        user4.setPassword(encoder.encode(user4.getPassword()));
////        user5.setPassword(encoder.encode(user5.getPassword()));
////        user6.setPassword(encoder.encode(user6.getPassword()));
//        user7.setPassword(encoder.encode(user7.getPassword()));
//        user8.setPassword(encoder.encode(user8.getPassword()));
//        user9.setPassword(encoder.encode(user9.getPassword()));
//        user10.setPassword(encoder.encode(user10.getPassword()));
//        user11.setPassword(encoder.encode(user11.getPassword()));
//        user12.setPassword(encoder.encode(user12.getPassword()));
//        user13.setPassword(encoder.encode(user13.getPassword()));
//        user14.setPassword(encoder.encode(user14.getPassword()));
//        user15.setPassword(encoder.encode(user15.getPassword()));
//        user16.setPassword(encoder.encode(user16.getPassword()));
//        user17.setPassword(encoder.encode(user17.getPassword()));
//        user210.setPassword(encoder.encode(user210.getPassword()));
//        user18.setPassword(encoder.encode(user18.getPassword()));
//        user19.setPassword(encoder.encode(user19.getPassword()));
//        user20.setPassword(encoder.encode(user20.getPassword()));
//        user21.setPassword(encoder.encode(user21.getPassword()));
//        user22.setPassword(encoder.encode(user22.getPassword()));
//        user23.setPassword(encoder.encode(user23.getPassword()));
//        user24.setPassword(encoder.encode(user24.getPassword()));
//        user25.setPassword(encoder.encode(user25.getPassword()));
//        user26.setPassword(encoder.encode(user26.getPassword()));
//        user27.setPassword(encoder.encode(user27.getPassword()));
//        user28.setPassword(encoder.encode(user28.getPassword()));
//        user29.setPassword(encoder.encode(user29.getPassword()));
//        user30.setPassword(encoder.encode(user30.getPassword()));
//        user31.setPassword(encoder.encode(user31.getPassword()));
//        user32.setPassword(encoder.encode(user32.getPassword()));
//
////        userRepo.save(user);
//        userRepo.save(user1);
//        userRepo.save(user2);
////        userRepo.save(user3);
////        userRepo.save(user4);
////        userRepo.save(user5);
////        userRepo.save(user6);
//        userRepo.save(user7);
//        userRepo.save(user8);
//        userRepo.save(user9);
//        userRepo.save(user10);
//        userRepo.save(user11);
//        userRepo.save(user12);
//        userRepo.save(user13);
//        userRepo.save(user14);
//        userRepo.save(user15);
//        userRepo.save(user16);
//        userRepo.save(user17);
//        userRepo.save(user210);
//        userRepo.save(user18);
//        userRepo.save(user19);
//        userRepo.save(user20);
//        userRepo.save(user21);
//        userRepo.save(user22);
//        userRepo.save(user23);
//        userRepo.save(user24);
//        userRepo.save(user25);
//        userRepo.save(user26);
//        userRepo.save(user27);
//        userRepo.save(user28);
//        userRepo.save(user29);
//        userRepo.save(user30);
//        userRepo.save(user31);
//        userRepo.save(user32);
//
//
//
//
//
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
