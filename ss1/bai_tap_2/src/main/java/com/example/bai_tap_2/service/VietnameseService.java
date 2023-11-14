package com.example.bai_tap_2.service;

import com.example.bai_tap_2.repository.IVietnameseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VietnameseService implements IVietnameseService{
    @Autowired
    private IVietnameseRepository vietnameseRepository;
    @Override
    public String search(String english) {
        return vietnameseRepository.search(english);
    }
}
