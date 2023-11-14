package com.example.thuc_hanh.repository;

import com.example.thuc_hanh.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> list = new ArrayList<>();
    static {list.add(new Customer(1,"Nguyen Khac Nhat","nhat@codegym.vn","Hà Nội"));
            list.add(new Customer(2,"Dang Huy Hoa","hoa.dang@codegym.vn","Đà Nẵng"));
            list.add(new Customer(3,"Le Thi Chau","chau.le@codegym.vn","Hà Nội"));
            list.add(new Customer(4,"Nguyen Thi Duong","duong.nguyen@codegym.vn","Sài Gòn"));
            list.add(new Customer(5,"Codegym","codegym@codegym.vn","Việt Nam"));}
    @Override
    public List<Customer> fillAll() {
        return list;
    }
}
