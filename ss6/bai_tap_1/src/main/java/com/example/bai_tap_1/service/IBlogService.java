package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String searchName, Pageable pageable);
    List<Blog> search(String name);
    Blog findById(int id);
    void add(Blog blog);
    void delete(int id);

//    void update(int id, Blog blog);

}
