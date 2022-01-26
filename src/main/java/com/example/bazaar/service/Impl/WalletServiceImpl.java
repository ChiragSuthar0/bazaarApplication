package com.example.bazaar.service.Impl;

import com.example.bazaar.entity.Wallet;
import com.example.bazaar.repository.WalletRepository;
import com.example.bazaar.service.WalletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotatedElementUtils;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    private WalletRepository walletRepo;

    public WalletServiceImpl(WalletRepository walletRepo) {
        super();
        this.walletRepo = walletRepo;
    }

    @Override
    public Wallet findUserWallet(String userName) {
        return walletRepo.findById(userName).get();
    }
}
