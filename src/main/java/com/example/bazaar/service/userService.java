package com.example.bazaar.service;

import com.example.bazaar.entity.User;

public interface userService {
    User getUserById(Long id);
    void deleteUserById(Long id);
    User saveUser(User user);
}
