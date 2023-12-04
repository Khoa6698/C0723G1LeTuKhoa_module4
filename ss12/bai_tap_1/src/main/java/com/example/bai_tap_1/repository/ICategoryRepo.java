package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepo extends JpaRepository<Category,Integer> {
}
