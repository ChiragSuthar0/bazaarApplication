package com.example.bazaar.service.Impl;

import com.example.bazaar.BuisnessLayer.UserDetailsImpl;
import com.example.bazaar.entity.User;
import com.example.bazaar.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    userRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findUserByUserName(username);

        if (user == null) {
            throw new UsernameNotFoundException("Not Found: " + username);
        }

        return new UserDetailsImpl(user);
    }
}
