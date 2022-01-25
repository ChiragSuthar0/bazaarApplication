package com.example.bazaar.service.Impl;

import com.example.bazaar.entity.shareDetail;
import com.example.bazaar.repository.shareDetailsRepository;
import com.example.bazaar.service.shareService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class shareServiceImpl implements shareService {

    private shareDetailsRepository shareRepo;

    public shareServiceImpl(shareDetailsRepository shareRepo) {
        super();
        this.shareRepo = shareRepo;
    }

    @Override
    public List<shareDetail> getAllShareDetails() {
        return shareRepo.findAll();
    }

    @Override
    public shareDetail getSharePrice(String companyName) {
        return shareRepo.findById(companyName).get();
    }

    @Override
    public void deleteCompany(String companyName) {
        shareRepo.deleteById(companyName);
    }

    @Override
    public shareDetail saveShareDetail(shareDetail share) {
        return shareRepo.save(share);
    }
}
