package com.example.BookMyShow.service;

import com.example.BookMyShow.model.BookMyShow;
import com.example.BookMyShow.respository.BookMyShowRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookMyShowService {

    private final BookMyShowRepository bookMyShowRepository;

    public BookMyShowService(BookMyShowRepository bookMyShowRepository) {
        this.bookMyShowRepository = bookMyShowRepository;
    }

    public List<BookMyShow> getAllBooks() {
        return bookMyShowRepository.findAll();
    }

    public BookMyShow getBooking(String custId) {
        return bookMyShowRepository.findById(custId).orElse(null);
    }


    public BookMyShow create(BookMyShow book) {
        return bookMyShowRepository.save(book);
    }

    public void delete(String bookId) {
        bookMyShowRepository.deleteById(bookId);
    }

    public BookMyShow update(BookMyShow book, String custId) {
        BookMyShow book1 = bookMyShowRepository.findById(custId).get();
        book1.setPrice(book.getPrice());
        book.updateNoOfSeats(book.getNoOfSeats());
        bookMyShowRepository.save(book1);
        return book1;
    }

    public void deleteAll() {
        bookMyShowRepository.deleteAll();
    }
}
