package com.webstack.app.service.impl;

import com.webstack.app.repository.UserRepository;
import com.webstack.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import com.webstack.app.entity.User;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User userSave(User user) {
        user.setName(user.getName());
        user.setLastName(user.getLastName());
       return userRepository.save(user);
    }

}
