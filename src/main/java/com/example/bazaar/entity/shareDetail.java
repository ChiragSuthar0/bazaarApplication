package com.example.bazaar.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class shareDetail {
    @Id
    private String companyName;
    private Double price;

    public shareDetail() {

    }

    public shareDetail(String companyName, Double price) {
        this.companyName = companyName;
        this.price = price;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
