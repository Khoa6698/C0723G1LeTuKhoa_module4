package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Blog;
import com.example.bai_tap_1.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(String searchName, Pageable pageable) {
        return blogRepository.search("%"+searchName+"%",pageable);
    }

    @Override
    public List<Blog> search(String name) {
        return null;
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void add(Blog blog) {
        blogRepository.save(blog);
    }


    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

//    @Override
//    public void update(int id, Blog blog) {
//        blogRepository.save(id,blog);
//    }
}
