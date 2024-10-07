package com.biblioteca.api.controllers;

import com.biblioteca.api.models.Book;
import com.biblioteca.api.services.BookService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    public BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping("/get")
    public String getBook(){
        return bookService.helloWorld("Iran");
    }

    @PostMapping("/post")
    public String postBook(@RequestBody Book body){
        return body.getNome();
    }
}