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

        User user = new User("uname", "fname", "sname", "pword", "email@email.com");
        user.setPassword(encoder.encode(user.getPassword()));
        userRepo.save(user);

//        User user1 = new User("MSD", "Malay", "Damani", "12345678", "damanimalay@gmail.com");
//        User user2 = new User("MBB", "Manav", "Bhavsar", "lakelake", "manpdeu@gmail.com");
//        User user3 = new User("mg593614", "Mayank", "Gupta", "987654321", "mg593614@gmail.com");
//        User user4 = new User("Vivek","Vivek","Sakariya","1234","vivek123@gmail.com");
//        User user5 = new User("Yash","Yash","Jobanputra","1234","yash12@gmail.com");
//        User user6 = new User("Uday7","Uday","Baldha","Uday77","uday.bch20@sot.pdpu.ac.in");
//        User user7 = new User("Jaymin75","Jaymin","Desai","jrd75","jayminrdesai@gmail.com");
//        User user8 = new User("Sejal76","Sejal","Desai","sd76","sejal291176@gmail.com");
//        User user9 = new User("Diya13","Diya1","Desai","djd13","21BABBA131@sls.pdpu.ac.in");
//        User user10 = new User("n2xel","Neel","Thaker","n2x20","neel.tmc18@sot.pdpu.ac.in");
//        User user11 = new User("khushi","Khushi","Teli","khushi123","khushi.tbb19@sls.pdpu.ac.in");
//        User user12 = new User("yajushi","yajushi","patel","yajushi123","yajushi.pbb19@sls.pdpu.ac.in");
//        User user13 = new User("Aum","Aum","Trivedi","aum123","aum.tbb19@sls.pdpu.ac.in");
//        User user14 = new User("Doi07", "Ishaan", "Doi", "12345", "ishaan.dbb19@sls.pdpu.ac.in ");
//        User user15 = new User("harshilbhatt_", "Harshil", "Bhatt", "1234567", "harshilbhatt8198@gmail.com");
//        User user16 = new User("avani", "Avani"," Firke", "AvaniF24","21BABBA114@sls.pdpu.ac.in");
//        User user17 = new User("Dhruv19", "dhruv", "Gandecha", "1234#1234", "dhruv.gbb19@sls.pdpu.ac.in");
//        User user18 = new User("MSD", "Malay", "Damani", "12345678", "damanimalay@gmail.com");
//        User user19 = new User("BhavyaPatel", "Bhavya", "Patel", "Bhavya1234", "mebhavya26@gmail.com");
//        User user20 = new User("pancham123","pancham","vashi","vashi123","Pancham.vashi@gmail.com");
//        User user21 = new User("nirmit", "Nirmit", "Jikaria", "nirmit005", "nirmit.jbb20@sls.pdpu.ac.in");
//        User user22 = new User("Diya_Desai", "Diya", "Desai", "aashna13","diyaseju@gmail.com" );
//        User user23 = new User("Riddhi_Ramchandani", "Riddhi", "Ramchandani", "r123", "riddhi.rbb20@sls.pdpu.ac.in");
//        User user24 = new User("Parva_Jani" , "Parva" , "Jani" , "parva08" , "parvajani08@gmail.com" );
//        User user25 = new User("Adarshsingh_Thakur" , "Adarshsingh" , "Thakur" , "Adarsh708" , "adarshthaku82@gmail.com");
//        User user26 = new User("SAM" , "Samvit" , "Rangani" , "sam@12" , "21babba097@sls.pdpu.ac.in");
//        User user27 = new User("Naitik_Patel", "Naitik", "Patel", "Naitik@1406", "naitikpatel14600@gmail.com");
//        User user28 = new User("Tanish26", "Tanish", "Mukherjee", "Tnsh12@26", "tanish.mbcom20@sls.pdpu.ac.in");
//        User user29 = new User("Advait_k", "Advait", "Kabra", "advait@23", "advaitkabra@outlook.com");
//        User user30 = new User("mukesh" , "Mukesh" , "Deivendran" , "1234567890" , "mukesh.dbt20@spt.pdpu.ac.in");
//        User user31 = new User("nikisha" , "Nikisha" , "Upadhyay" , "1234567817","nikisha.ubb20@sls.pdpu.ac.in");
//        User user32 = new User("avnee_2", "Avnee", "Satija", "avnee123", "avnee.sbb19@sls.pdpu.ac.in");
//        User user33 = new User("anika_2", "Anika", "Dadhich", "anika123", "anika.dbb19@sls.pdpu.ac.in");
//        User user34 = new User("devdalia9_2", "Dev", "Dalia", "1234567", "devdalia9@gmail.com");
//        User user35 = new User("Rahi30_2", "Rahi ", "Mehta", "Rahi3030", "rahi.mehta007@gmail.com");
//        User user36 = new User("HemangSharma_2", "Hemang", "Sharma", "Hemang9726","hemangsharma111@gmail.com");
//        User user37 = new User("aashishkodi_2", "Aashish", "Kodi", "6h6f30j3", "aashishkodi10@gmail.com");
//        User user38 = new User("TVS$$_2", "Tirth", "Shah", "Tirthshah18!", "tirth4uall@gmail.com");
//        User user39 = new User("bhavyakotak_2", "bhavya", "kotak", "bhavyakotak", "bhavyakotak2@gmail.com");
//        User user40 = new User("ananya_2 chaturvedi","ananya","chaturvedi","ananya@1234","ananya.cbb20@sls.pdpu.ac.in");
//        User user41 = new User("patrikx_2", "Prateek", "Mundhra", "1234567890", "ptkmundhra4@gmail.com");
//        User user42 = new User("Meg_2", "Megha", "Mistry", "meg31", "megha.mistry2002@gmail.com");
//        User user43 = new User("Manav3012_2", "Manav", "Sanghvi","Manav002","manav.sce20@sot.pdpu.ac.in");
//        User user44 = new User("vanshika123_2", "Vanshika", "Chitre", "vc179", "21bco123@sls.pdpu.ac.in");
//        User user45 = new User("Doi07_2", "Ishaan", "Doi", "12345", "ishaan.dbb19@sls.pdpu.ac.in ");
//        User user46 = new User("harshilbhatt__2", "Harshil", "Bhatt", "1234567", "harshilbhatt8198@gmail.com");
//        User user47 = new User("avani_2", "Avani"," Firke", "AvaniF24","21BABBA114@sls.pdpu.ac.in");
//        User user48 = new User("Dhruv19_2", "dhruv", "Gandecha", "1234#1234", "dhruv.gbb19@sls.pdpu.ac.in");
//        User user49 = new User("MSD_2", "Malay", "Damani", "12345678", "damanimalay@gmail.com");
//        User user50 = new User("BhavyaPatel_2", "Bhavya", "Patel", "Bhavya1234", "mebhavya26@gmail.com");
//        User user51 = new User("pancham123_2","pancham","vashi","vashi123","Pancham.vashi@gmail.com");
//        User user52 = new User("nirmit_2", "Nirmit", "Jikaria", "nirmit005", "nirmit.jbb20@sls.pdpu.ac.in");
//        User user53 = new User("Diya_Desai_2", "Diya", "Desai", "aashna13","diyaseju@gmail.com" );
//        User user54 = new User("Riddhi_Ramchandani_2", "Riddhi", "Ramchandani", "r123", "riddhi.rbb20@sls.pdpu.ac.in");
//        User user55 = new User("Parva_Jani_2" , "Parva" , "Jani" , "parva08" , "parvajani08@gmail.com" );
//        User user56 = new User("Adarshsingh_Thakur_2" , "Adarshsingh" , "Thakur" , "Adarsh708" , "adarshthaku82@gmail.com");
//        User user57 = new User("SAM_2" , "Samvit" , "Rangani" , "sam@12" , "21babba097@sls.pdpu.ac.in");
//        User user58 = new User("Naitik_Patel_2", "Naitik", "Patel", "Naitik@1406", "naitikpatel14600@gmail.com");
//        User user59 = new User("Tanish26_2", "Tanish", "Mukherjee", "Tnsh12@26", "tanish.mbcom20@sls.pdpu.ac.in");
//        User user60 = new User("Advait_k_2", "Advait", "Kabra", "advait@23", "advaitkabra@outlook.com");
//        User user61 = new User("mukesh_2" , "Mukesh" , "Deivendran" , "1234567890" , "mukesh.dbt20@spt.pdpu.ac.in");
//        User user62 = new User("nikisha_2" , "Nikisha" , "Upadhyay" , "1234567817","nikisha.ubb20@sls.pdpu.ac.in");
//        User user63 = new User("anantBhai", "Anant", "Chaturvedi", "anantMeraBhai", "canant105@gmail.com");
//        User user64 = new User();
//        User user65 = new User();
//        User user66 = new User();

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
//        user15.setPassword(encoder.encode(user15.getPassword()));
//        user16.setPassword(encoder.encode(user16.getPassword()));
//        user17.setPassword(encoder.encode(user17.getPassword()));
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
//        user33.setPassword(encoder.encode(user33.getPassword()));
//        user34.setPassword(encoder.encode(user34.getPassword()));
//        user35.setPassword(encoder.encode(user35.getPassword()));
//        user36.setPassword(encoder.encode(user36.getPassword()));
//        user37.setPassword(encoder.encode(user37.getPassword()));
//        user38.setPassword(encoder.encode(user38.getPassword()));
//        user39.setPassword(encoder.encode(user39.getPassword()));
//        user40.setPassword(encoder.encode(user40.getPassword()));
//        user41.setPassword(encoder.encode(user41.getPassword()));
//        user42.setPassword(encoder.encode(user42.getPassword()));
//        user43.setPassword(encoder.encode(user43.getPassword()));
//        user44.setPassword(encoder.encode(user44.getPassword()));
//        user45.setPassword(encoder.encode(user45.getPassword()));
//        user46.setPassword(encoder.encode(user46.getPassword()));
//        user47.setPassword(encoder.encode(user47.getPassword()));
//        user48.setPassword(encoder.encode(user48.getPassword()));
//        user49.setPassword(encoder.encode(user49.getPassword()));
//        user50.setPassword(encoder.encode(user50.getPassword()));
//        user51.setPassword(encoder.encode(user51.getPassword()));
//        user52.setPassword(encoder.encode(user52.getPassword()));
//        user53.setPassword(encoder.encode(user53.getPassword()));
//        user54.setPassword(encoder.encode(user54.getPassword()));
//        user55.setPassword(encoder.encode(user55.getPassword()));
//        user56.setPassword(encoder.encode(user56.getPassword()));
//        user57.setPassword(encoder.encode(user57.getPassword()));
//        user58.setPassword(encoder.encode(user58.getPassword()));
//        user59.setPassword(encoder.encode(user59.getPassword()));
//        user60.setPassword(encoder.encode(user60.getPassword()));
//        user61.setPassword(encoder.encode(user61.getPassword()));
//        user62.setPassword(encoder.encode(user62.getPassword()));
//        user63.setPassword(encoder.encode(user63.getPassword()));
//        user64.setPassword(encoder.encode(user64.getPassword()));
//        user65.setPassword(encoder.encode(user65.getPassword()));
//        user66.setPassword(encoder.encode(user66.getPassword()));

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
//        userRepo.save(user15);
//        userRepo.save(user16);
//        userRepo.save(user17);
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
//        userRepo.save(user33);
//        userRepo.save(user34);
//        userRepo.save(user35);
//        userRepo.save(user36);
//        userRepo.save(user37);
//        userRepo.save(user38);
//        userRepo.save(user39);
//        userRepo.save(user40);
//        userRepo.save(user41);
//        userRepo.save(user42);
//        userRepo.save(user43);
//        userRepo.save(user44);
//        userRepo.save(user45);
//        userRepo.save(user46);
//        userRepo.save(user47);
//        userRepo.save(user48);
//        userRepo.save(user49);
//        userRepo.save(user50);
//        userRepo.save(user51);
//        userRepo.save(user52);
//        userRepo.save(user53);
//        userRepo.save(user54);
//        userRepo.save(user55);
//        userRepo.save(user56);
//        userRepo.save(user57);
//        userRepo.save(user58);
//        userRepo.save(user59);
//        userRepo.save(user60);
//        userRepo.save(user61);
//        userRepo.save(user62);
//        userRepo.save(user63);
//        userRepo.save(user64);
//        userRepo.save(user65);
//        userRepo.save(user66);
//
//        User usr = new User("admin1", "admin", "admin", "12345678", "pdpubnb@gmail.com");
//        usr.setPassword(encoder.encode(usr.getPassword()));
//        usr.setRole("ROLE_ADMIN");
//        userRepo.save(usr);
//
//        User usr2 = new User("admin2", "admin", "admin", "12345678", "pdpubnb@gmail.com");
//        usr.setPassword(encoder.encode(usr.getPassword()));
//        usr.setRole("ROLE_ADMIN");
//        userRepo.save(usr2);
//
//        User usr3 = new User("admin3", "admin", "admin", "12345678", "pdpubnb@gmail.com");
//        usr.setPassword(encoder.encode(usr.getPassword()));
//        usr.setRole("ROLE_ADMIN");
//        userRepo.save(usr3);
//
//        User usr4 = new User("admin4", "admin", "admin", "12345678", "pdpubnb@gmail.com");
//        usr.setPassword(encoder.encode(usr.getPassword()));
//        usr.setRole("ROLE_ADMIN");
//        userRepo.save(usr4);


//        shareDetail share = new shareDetail("ICICI Bank", 200D);
//        shareRepo.save(share);
//        shareDetail share1 = new shareDetail("Adani Wilmar", 115D);
//        shareRepo.save(share1);
//        shareDetail share2 = new shareDetail("Nestle India", 330D);
//        shareRepo.save(share2);
//        shareDetail share3 = new shareDetail("Infosys", 135D);
//        shareRepo.save(share3);
//        shareDetail share4 = new shareDetail("Airtel", 50D);
//        shareRepo.save(share4);
//        shareDetail share5 = new shareDetail("L & T", 150D);
//        shareRepo.save(share5);
//        shareDetail share6 = new shareDetail("Reliance", 220D);
//        shareRepo.save(share6);
//        shareDetail share7 = new shareDetail("Adani Greens", 200D);
//        shareRepo.save(share7);
//        shareDetail share8 = new shareDetail("Zydus Healthcare", 330D);
//        shareRepo.save(share8);
//        shareDetail share9 = new shareDetail("Nestle India", 1690D);
//        shareRepo.save(share9);
//        shareDetail share0 = new shareDetail("Zomato", 70D);
//        shareRepo.save(share0);
//        shareDetail share01 = new shareDetail("Aditya Birla Finance Capital", 290D);
//        shareRepo.save(share01);

    }
}
