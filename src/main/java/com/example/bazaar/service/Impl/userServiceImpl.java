package com.example.bazaar.service.Impl;

import com.example.bazaar.entity.User;
import com.example.bazaar.repository.userRepository;
import com.example.bazaar.service.userService;
import org.springframework.stereotype.Service;

@Service
public class userServiceImpl implements userService {
    private userRepository userRepo;

    public userServiceImpl(userRepository userRepo) {
        super();
        this.userRepo = userRepo;
    }


    @Override
    public User getUserById(Long id) {
        return userRepo.findById(id).get();
    }

    @Override
    public void deleteUserByUserName(Long id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return userRepo.findUserByUserName(userName);
    }

    @Override
    public User saveUser(User user) {
        return userRepo.save(user);
    }
}
