package com.example.bazaar.service;

import com.example.bazaar.entity.company;

import java.util.List;

public interface companyService {
    company getNumberOfShares(String UserName);
    void updateNumberOfShares(company comp);
    List<company> allSharesOfUser(String userName);
    company getNumberofSharesOfCompanyFromUser(String userName, String companyName);
}
