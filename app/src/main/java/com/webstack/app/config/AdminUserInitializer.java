package com.webstack.app.config;

import com.webstack.app.entity.Users;
import com.webstack.app.repository.CustomUserDetailsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class AdminUserInitializer {

    @Bean
    public CommandLineRunner createAdminUser(CustomUserDetailsRepository customUserDetailsRepository,
                                             PasswordEncoder passwordEncoder){
        return args -> {
            if (customUserDetailsRepository.findByUsername("user").isEmpty()){
                Users admin = new Users();
                admin.setUsername("user");
                admin.setPassword(passwordEncoder.encode("password"));
                admin.setRole("ROLE_ADMIN");
                customUserDetailsRepository.save(admin);
                System.out.println("Default admin user created");
            }
        };
    }
}
