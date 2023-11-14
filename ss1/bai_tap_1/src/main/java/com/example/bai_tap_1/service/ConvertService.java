package com.example.bai_tap_1.service;

import com.example.bai_tap_1.repository.IConvertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConvertService implements IConvertService{
    @Autowired
    private IConvertRepository convertRepository;
    @Override
    public double UsdToVnd(double vnd) {
     return  convertRepository.UsdToVnd(vnd);
    }
}
