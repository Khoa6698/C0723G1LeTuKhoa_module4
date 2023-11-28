package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowRepo extends JpaRepository<Borrow,Integer> {
}
