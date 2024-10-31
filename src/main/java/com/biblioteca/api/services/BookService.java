package com.biblioteca.api.services;

import com.biblioteca.api.models.Book;
import com.biblioteca.api.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;

    //procura por todos os livros e retorna todos os seus atributos
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
    //salva na Base de dados o Livro
    public Book saveBook(Book book){
        return bookRepository.save(book);
    }
}
