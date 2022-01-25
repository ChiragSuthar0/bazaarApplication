package com.example.bazaar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {
    @Id
    @Column(name = "user_name", unique = true, nullable = false)
    private String userName;
    @Column(name = "balance", nullable = false)
    private Long money;

    public Wallet() {
    }

    public Wallet(String userName, Long money) {
        this.userName = userName;
        this.money = money;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }
}
