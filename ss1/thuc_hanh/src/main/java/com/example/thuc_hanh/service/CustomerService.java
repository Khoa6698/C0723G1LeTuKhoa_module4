package com.example.thuc_hanh.service;

import com.example.thuc_hanh.model.Customer;
import com.example.thuc_hanh.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List<Customer> fillAll() {
        return customerRepository.fillAll();
    }
}
