package com.example.bai_tap_1.service;

import com.example.bai_tap_1.model.Book;
import com.example.bai_tap_1.model.Borrow;
import com.example.bai_tap_1.repository.IBookRepo;
import com.example.bai_tap_1.repository.IBorrowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BookService implements IBookService {
    private IBookRepo bookRepo;

    @Autowired
    private IBorrowRepo borrowRepo;

    @Override
    public List<Book> findAll() {
        return bookRepo.findAll();
    }

    @Override
    public boolean borrow(Book book) {
        return false;
    }

    @Override
    public Book findById(int id) {
        return bookRepo.findById(id).get();
    }

    @Override
    public void borrowBook(int idBook, long code) {
        Book book = findById(idBook);
        if (book != null && book.getCount() > 0) {
            book.setCount(book.getCount() - 1);
            bookRepo.save(book);
        } else {
            throw new RuntimeException("Can't borrow book");
        }
    }

    @Override
    public long generateBorrowCode() {
        Random random = new Random();
        long code = random.nextInt(90000) + 10000;
        return code;
    }

    @Override
    public void saveBorrow(long code, Book book) {
        Borrow borrow = new Borrow();
        borrow.setCodeBorrow(code);
        borrow.setBook(book);
    }

}
