package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    List<Blog> search(String name);
    Blog findById(int id);
    void add(Blog blog);
    void delete(int id);

//    void update(int id, Blog blog);

}
