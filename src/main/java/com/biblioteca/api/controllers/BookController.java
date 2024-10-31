package com.biblioteca.api.controllers;

import com.biblioteca.api.models.Book;
import com.biblioteca.api.services.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    public BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }
    @GetMapping("/getall")
    public List<Book> getAllBooks(){
        return bookService.getBooks();
    }
    @PostMapping("/post")
    public Book postBook(@RequestBody Book body){
        return bookService.saveBook(body);
    }
}