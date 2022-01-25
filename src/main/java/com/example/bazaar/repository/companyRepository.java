package com.example.bazaar.repository;

import com.example.bazaar.entity.company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface companyRepository extends JpaRepository<company, Long> {
    List<company> findAllByUserName(String userName);
    company findByCompanyNameAndUserName(String companyName, String userName);
    company getByUserName(String userName);
}
