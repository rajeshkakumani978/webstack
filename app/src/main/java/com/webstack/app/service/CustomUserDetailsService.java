package com.webstack.app.service;

import com.webstack.app.entity.Users;
import com.webstack.app.repository.CustomUserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private CustomUserDetailsRepository customUserDetailsRepository;

    @Override
    public Users loadUserByUsername(String username) {
        return customUserDetailsRepository.findByUsername(username)
                .orElseThrow();
    }

}
