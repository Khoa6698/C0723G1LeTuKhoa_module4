package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.User;
import com.example.bai_tap_1.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepository;
    @Override
    public void newUser(User user) {
        userRepository.save(user);
    }
}
