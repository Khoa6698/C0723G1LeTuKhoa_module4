package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();

    Optional<Product> findById(Long id);
}
