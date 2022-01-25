package com.example.bazaar.service.Impl;

import com.example.bazaar.entity.News;
import com.example.bazaar.repository.NewsRepository;
import com.example.bazaar.service.NewsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    private NewsRepository newsRepository;

    public NewsServiceImpl(NewsRepository newsRepository) {
        super();
        this.newsRepository = newsRepository;
    }

    @Override
    public List<News> getAllNews() {
        return newsRepository.findAll();
    }
}
