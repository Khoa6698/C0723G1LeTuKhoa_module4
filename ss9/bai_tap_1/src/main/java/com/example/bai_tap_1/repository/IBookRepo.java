package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepo extends JpaRepository<Book,Integer> {
}
