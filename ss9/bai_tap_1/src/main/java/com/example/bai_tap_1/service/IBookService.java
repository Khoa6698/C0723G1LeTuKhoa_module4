package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();
    boolean borrow(Book book);
    Book findById(int id);
    void borrowBook(int idBook, long code);
    long generateBorrowCode();
    void saveBorrow(long code, Book book);
}
