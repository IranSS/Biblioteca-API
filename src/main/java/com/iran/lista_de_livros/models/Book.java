package com.iran.lista_de_livros.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String nome;
    private String ano;
    private String descricao;
}
