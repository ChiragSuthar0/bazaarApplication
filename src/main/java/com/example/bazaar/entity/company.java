package com.example.bazaar.entity;

import jdk.jfr.Unsigned;

import javax.persistence.*;

@Entity
public class company {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "user_name", nullable = false)
    private String userName;
    @Column(name = "company_name", nullable = false)
    private String companyName;
    @Column(name = "share_count", nullable = false)
    private Long shareCount;

    public company() {

    }

    public company(String userName, String companyName, Long shareCount) {
        this.userName = userName;
        this.companyName = companyName;
        this.shareCount = shareCount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getShareCount() {
        return shareCount;
    }

    public void setShareCount(Long shareCount) {
        this.shareCount = shareCount;
    }
}
