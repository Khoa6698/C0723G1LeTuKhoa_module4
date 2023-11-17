package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class ProductRepository implements IProductRepository{
    private static Map<Integer,Product> list = new HashMap<>();
    static {
        list.put(1,new Product(1,"rau muon",10000,"rau"));
        list.put(2,new Product(2,"man Ha Noi",20000,"trai cay"));
        list.put(3,new Product(3,"cai thia",10000,"rau"));
        list.put(4,new Product(4,"chuoi",15000,"trai cay"));
        list.put(5,new Product(5,"cam",10000,"trai cay"));
        list.put(6,new Product(6,"dua hau",20000,"trai cay"));
        list.put(7,new Product(7,"hanh",5000,"rau"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(list.values());
    }

    @Override
    public void save(Product product) {
        list.put(product.getId(),product);
    }

    @Override
    public Product findById(int id) {
        return list.get(id);
    }

    @Override
    public void update(int id, Product product) {
       list.put(id,product);
    }

    @Override
    public void remove(int id) {
       list.remove(id);
    }

    @Override
    public Product findByName(String name) {
        return list.get(name);
    }
}
