package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    @Query(nativeQuery = true, value = "select * from blog where category_id = :cate")
    List<Blog> findBlogByCategoryId(@Param("cate") Integer idCategory);
}
