package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    void create(Blog blog);
    void delete(int id);
    void update(Blog blog);
    Blog findBlogById(int id);
    List<Blog> findBlogByName(String name);
    Page<Blog> findAll(Pageable pageable);
}
