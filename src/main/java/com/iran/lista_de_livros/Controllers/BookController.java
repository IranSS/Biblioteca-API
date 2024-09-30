package com.iran.lista_de_livros.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {

    @GetMapping("/get")
    public String getBook(){
        return "Iniciando projeto de listas de livros";
    }
}