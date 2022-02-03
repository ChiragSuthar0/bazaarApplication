package com.example.bazaar.controller;

import com.example.bazaar.entity.User;
import com.example.bazaar.entity.company;
import com.example.bazaar.entity.shareDetail;
import com.example.bazaar.service.NewsService;
import com.example.bazaar.service.companyService;
import com.example.bazaar.service.shareService;
import com.example.bazaar.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
public class userController {

    @Autowired
    PasswordEncoder encoder;

    private userService userServ;
    private shareService shareServ;
    private companyService companyServ;
    private NewsService newsService;

    public userController(userService userServ, shareService shareServ, companyService companyServ, NewsService newsService) {
        this.userServ = userServ;
        this.shareServ = shareServ;
        this.companyServ = companyServ;
        this.newsService = newsService;
    }


    @GetMapping("/AboutUs")
    public String AboutUs(Model model) {
        return "AboutUs";
    }

    @GetMapping("/home")
    public String home(Model model) {
//        model.addAttribute("home");
        return "home";
    }

    @GetMapping("/profile")
    public String listShares(Model model, @AuthenticationPrincipal UserDetails user) {
        model.addAttribute("COMPANY", companyServ.allSharesOfUser(user.getUsername()));
        model.addAttribute("Wallet", userServ.getUserByUserName(user.getUsername()));
        return "profile";
    }

    @GetMapping("/SharePrices")
    public String displayShares(Model model) {
        model.addAttribute("shares", shareServ.getAllShareDetails());
        return "share_details";
    }

    @GetMapping("/Shares/buy/{id}")
    public String buyShareForm(@PathVariable String id, Model model, @AuthenticationPrincipal UserDetails user) {
        if(companyServ.getNumberofSharesOfCompanyFromUser(user.getUsername(), id) == null) {
            model.addAttribute("COMPANY", new company(user.getUsername(), id, 0L));
        }
        else {
            model.addAttribute("COMPANY", companyServ.getNumberofSharesOfCompanyFromUser(user.getUsername(), id));
        }
//        model.addAttribute("company", companyServ.getNumberofSharesOfCompanyFromUser("Chirag", id));
        return "buy_share";
    }

    @PostMapping("/Shares/buy/{id}")
    public String addSharePurchase(@PathVariable String id,
                                   @ModelAttribute("COMPANY") company comp,
                                   @AuthenticationPrincipal UserDetails details,
                                   Model model) {

        System.out.println("\n\n\nlaskdhl ash ghdjsa;afbv luhadfh hadlsk hlahf hkjadshf hads adfkjh akd fkadl d dh\n\n");

        company purchaseShare;
        if (companyServ.getNumberofSharesOfCompanyFromUser(details.getUsername(), comp.getCompanyName()) == null) {
            purchaseShare = new company();
            System.out.println("\n\nnull hai bhaiya\n\n");
            System.out.println(comp.getCompanyName() + "\n"
                                +comp.getUserName() + "\n"
                                +comp.getShareCount()
            );
            purchaseShare.setUserName(details.getUsername());
            purchaseShare.setCompanyName(comp.getCompanyName());
            purchaseShare.setShareCount(comp.getShareCount());
        }
        else {
            purchaseShare = companyServ.getNumberofSharesOfCompanyFromUser(details.getUsername(), comp.getCompanyName());
            purchaseShare.setUserName(details.getUsername());
            purchaseShare.setCompanyName(comp.getCompanyName());
            purchaseShare.setShareCount(purchaseShare.getShareCount() + comp.getShareCount());
        }

        shareDetail share = shareServ.getSharePrice(purchaseShare.getCompanyName());
        User userWallet = userServ.getUserByUserName(details.getUsername());

        System.out.println(userWallet.getWallet() +"\n"+ (share.getPrice() * purchaseShare.getShareCount()) + "\n" + (userWallet.getWallet() - (share.getPrice() * purchaseShare.getShareCount())));

        if(userWallet.getWallet() - (share.getPrice() * comp.getShareCount()) < 0){
            return "redirect:/Not_enough_money_in_bank.html";
        }
        userWallet.setWallet(userWallet.getWallet() - (share.getPrice() * comp.getShareCount()));
//        userServ.saveUser(userWallet);
        companyServ.updateNumberOfShares(purchaseShare);
        return "redirect:/home";
    }

    @GetMapping("/News")
    public String displayNews(Model model) {
        model.addAttribute("currentNews", AdminController.getCurrentNews());
        model.addAttribute("NEWS", newsService.getAllNews());
        return "News_display";
    }

    @GetMapping("Shares/sell/{id}")
    public String sellShareForm(@PathVariable String id, Model model, @AuthenticationPrincipal UserDetails user) {
        if(companyServ.getNumberofSharesOfCompanyFromUser(user.getUsername(), id) == null) {
            model.addAttribute("COMPANY", new company(user.getUsername(), id, 0L));
        }
        else {
            model.addAttribute("COMPANY", companyServ.getNumberofSharesOfCompanyFromUser(user.getUsername(), id));
        }
        return "sell_share";
    }

    @PostMapping("/Shares/sell/{id}")
    public String removeSharePurchase(@PathVariable String id,
                                      @ModelAttribute("COMPANY") company comp,
                                      @AuthenticationPrincipal UserDetails details,
                                      Model model) {
        company purchaseShare = companyServ.getNumberofSharesOfCompanyFromUser(details.getUsername(), comp.getCompanyName());

        purchaseShare = companyServ.getNumberofSharesOfCompanyFromUser(details.getUsername(), comp.getCompanyName());
        purchaseShare.setUserName(details.getUsername());
        purchaseShare.setCompanyName(comp.getCompanyName());
        if(purchaseShare.getShareCount() - comp.getShareCount() < 0) {
            return "redirect:/cannot_sell.html";
        }
        shareDetail share = shareServ.getSharePrice(purchaseShare.getCompanyName());
        User userWallet = userServ.getUserByUserName(details.getUsername());

        userWallet.setWallet(userWallet.getWallet() + (share.getPrice() * comp.getShareCount()));
        purchaseShare.setShareCount(purchaseShare.getShareCount() - comp.getShareCount());

        companyServ.updateNumberOfShares(purchaseShare);
        return "redirect:/home";
    }
}
