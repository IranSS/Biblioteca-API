package com.iran.lista_de_livros.controllers;

import com.iran.lista_de_livros.services.BookService;
import com.iran.lista_de_livros.models.Book;
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