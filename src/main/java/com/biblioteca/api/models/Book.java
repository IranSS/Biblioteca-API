package com.biblioteca.api.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "TB_BOOKS")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true)
    private String title;
    @Column(nullable = false, unique = false)
    private String year;
    @Column(nullable = false)
    private String description;

    //construtor padrão; é obrigatorio sua implementação por causa do JPA, pq? não sei;
    public Book(){}
}
