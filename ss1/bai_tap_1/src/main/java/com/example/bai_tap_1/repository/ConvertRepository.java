package com.example.bai_tap_1.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ConvertRepository implements IConvertRepository{
    @Override
    public double UsdToVnd(double vnd) {
        double usd = vnd * 23000;
        return usd;
    }

}
