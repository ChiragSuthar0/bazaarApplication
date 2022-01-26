package com.example.bazaar.service;

import com.example.bazaar.entity.User;

public interface userService {
    User getUserById(Long id);
    void deleteUserByUserName(Long id);
    User getUserByUserName(String userName);
    User saveUser(User user);
}
