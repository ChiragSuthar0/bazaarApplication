package com.example.bazaar.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfigurerImpl extends WebSecurityConfigurerAdapter {

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.userDetailsService(userDetailsService) // user store 1
                        .passwordEncoder(NoOpPasswordEncoder.getInstance());

        auth.inMemoryAuthentication()
                .withUser("Chirag")
                .password(getEncoder().encode("ChiR@g.$"))
                .roles("ADMIN", "USER")
                .and()
                .passwordEncoder(getEncoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .mvcMatchers("/admin", "/register", "/updateNews", "/updatePrice").hasRole("ADMIN")
                .mvcMatchers("/home", "/static/**").permitAll()
                .mvcMatchers("/**").authenticated()
                .and()
                .formLogin()
                .defaultSuccessUrl("/home", true)
                .and()
                .httpBasic();
    }

    @Bean
    public PasswordEncoder getEncoder() {
        return new BCryptPasswordEncoder();
    }
}
