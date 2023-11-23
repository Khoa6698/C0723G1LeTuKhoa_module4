package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    void deleteById(int id);

    @Query(value = "select * from blogs where blog_name like :searchName", nativeQuery = true)
    Page<Blog> search(@Param("searchName") String name, Pageable pageable);

}
