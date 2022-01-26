package com.example.bazaar.service;

import com.example.bazaar.entity.Wallet;

public interface WalletService {
    Wallet findUserWallet(String userName);
}
