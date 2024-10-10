package com.biblioteca.api.services;

import com.biblioteca.api.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    public String helloWorld(String name){
        return "Iniciando projeto de listas de livros, olá " + name;
    }
}
