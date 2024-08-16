package com.aos.aula01.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Livro {
    
    @Id
    @GeneratedValue
    private Long id;

    @Column
    @NonNull
    private String titulo;

    @Column
    @NonNull
    private String genero;

    @Column
    @NonNull
    private Integer qtdPaginas;

    @ManyToOne
    @JoinColumn(name = "autor_id")
    @JsonBackReference
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "editora_id")
    @JsonBackReference
    private Editora editora;
}
