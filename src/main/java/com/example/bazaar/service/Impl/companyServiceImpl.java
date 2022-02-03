package com.example.bazaar.service.Impl;

import com.example.bazaar.entity.company;
import com.example.bazaar.repository.companyRepository;
import com.example.bazaar.service.companyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class companyServiceImpl implements companyService {

    private companyRepository companyRepo;

    public companyServiceImpl(companyRepository companyRepo) {
        super();
        this.companyRepo = companyRepo;
    }

    @Override
    public company getNumberOfShares(String UserName) {
        return companyRepo.getByUserName(UserName);
    }

    @Override
    public void updateNumberOfShares(company comp) {
        companyRepo.save(comp);
    }

    @Override
    public List<company> allSharesOfUser(String userName) {
        return companyRepo.findAllByUserName(userName);
    }

    @Override
    public company getNumberofSharesOfCompanyFromUser(String userName, String companyName) {
        return companyRepo.findByCompanyNameAndUserName(companyName, userName);
    }
}
