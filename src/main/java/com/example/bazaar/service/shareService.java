package com.example.bazaar.service;

import com.example.bazaar.entity.shareDetail;

import java.util.List;

public interface shareService {
    List<shareDetail> getAllShareDetails();
    shareDetail getSharePrice(String companyName);
    void deleteCompany(String companyName);
    shareDetail saveShareDetail(shareDetail share);
}
