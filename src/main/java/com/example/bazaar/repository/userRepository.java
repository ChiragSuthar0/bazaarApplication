package com.example.bazaar.repository;

import com.example.bazaar.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends CrudRepository<User, Long> {
    User findUserByUserName(String userName);
}
