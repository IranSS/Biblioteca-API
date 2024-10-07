package com.biblioteca.api.services;

import org.springframework.stereotype.Service;

@Service
public class BookService {

    public String helloWorld(String name){
        return "Iniciando projeto de listas de livros, olá " + name;
    }
}
