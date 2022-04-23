package com.dawnz.bookseller.security;

import com.dawnz.bookseller.model.User;
import com.dawnz.bookseller.repository.IUserRepository;
import com.dawnz.bookseller.service.IUserService;
import com.dawnz.bookseller.util.SecurityUtils;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CustomUserDetailsServiceTest {


    @Test
    public void loadUserByUsername() throws UsernameNotFoundException {

    }
}