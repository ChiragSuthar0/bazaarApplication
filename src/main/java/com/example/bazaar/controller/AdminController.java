package com.example.bazaar.controller;

import com.example.bazaar.entity.News;
import com.example.bazaar.entity.User;
import com.example.bazaar.entity.shareDetail;
import com.example.bazaar.service.NewsService;
import com.example.bazaar.service.shareService;
import com.example.bazaar.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AdminController {

    @Autowired
    PasswordEncoder encoder;

    private static String currentNews;
    private shareService shareServ;
    private userService userServ;
    private NewsService newsServ;


    public AdminController (shareService shareServ, userService userServ, NewsService newsServ) {
        this.shareServ = shareServ;
        this.userServ = userServ;
        this.newsServ = newsServ;
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("shares", shareServ.getAllShareDetails());
        return "admin";
    }

    @GetMapping("/updatePrice/{id}")
    public String updateSharePrice(@PathVariable String id, Model model) {
        model.addAttribute("share", shareServ.getSharePrice(id));
        return "updateShare";
    }

    @PostMapping("/updatePrice/{id}")
    public String updateSharePrice(@PathVariable String id,
                                @ModelAttribute("share") shareDetail share_det,
                                @AuthenticationPrincipal UserDetails details,
                                Model model) {
        shareDetail sd = shareServ.getSharePrice(id);
        sd.setPrice(share_det.getPrice());

        shareServ.saveShareDetail(sd);
        return "redirect:/admin";
    }

    @GetMapping("/register")
    public String registerUser(Model model) {
        model.addAttribute("USER", new User());
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute("USER") User user) {

        user.setPassword(encoder.encode(user.getPassword()));
        userServ.saveUser(user);

        return "redirect:/home";
    }

    @GetMapping("/updateNews")
    public String updateNews(Model model) {
        model.addAttribute("NEWS", new News());
        return "news";
    }

    @PostMapping("/updateNews")
    public String updatingNews(@ModelAttribute News news) {
        currentNews = news.getNewsData();
        newsServ.saveNews(news);
        return "redirect:/admin";
    }

    public static String getCurrentNews() {
        return currentNews;
    }
}