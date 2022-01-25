package com.example.bazaar.entity;

import javax.persistence.*;

@Entity
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "News")
    private String newsData;

    public News() {
    }

    public News(String news) {
        this.newsData = news;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNewsData() {
        return newsData;
    }

    public void setNewsData(String news) {
        this.newsData = news;
    }
}
