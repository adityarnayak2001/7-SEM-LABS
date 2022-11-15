package com.example.BookMyShow.controller;

import com.example.BookMyShow.model.BookMyShow;
import com.example.BookMyShow.service.BookMyShowService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookMyShowController {
    private final BookMyShowService bookMyShowService;

    public BookMyShowController(BookMyShowService bookMyShowService) {
        this.bookMyShowService = bookMyShowService;
    }

    @GetMapping("/getAllBooking")
    public List<BookMyShow> getAllBooking() {
        return bookMyShowService.getAllBooks();
    }

    @GetMapping("/get/{bookID}")
    public BookMyShow getBook(@PathVariable String bookID) {
        return bookMyShowService.getBooking(bookID);
    }

    @PostMapping("/createBooking")
    public BookMyShow createBooking(@RequestBody BookMyShow book) {
        return bookMyShowService.create(book);
    }

    @DeleteMapping("/deleteBooking/{bookId}")
    public String deleteBooking(@PathVariable String bookId) {
        bookMyShowService.delete(bookId);
        return "Employee Deleted";
    }

    @PutMapping("/updateBooking/{bookId}")
    public BookMyShow updateBooking(@RequestBody BookMyShow book, @PathVariable String bookId) {
        return bookMyShowService.update(book, bookId);
    }

    @DeleteMapping("/deleteAllBooking")
    public String deleteAllBooking() {
        bookMyShowService.deleteAll();
        return "All Booking data deleted";
    }
}