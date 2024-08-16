package com.aos.aula01.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Autor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NonNull
    private String nome;

    @Column
    @NonNull
    private String cpf;

    @Column
    @NonNull
    private Short idade;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, orphanRemoval = true)
    //cascade = CascadeType.ALL operações de crud serão propagadas para pet
    //orphanRemoval garante que se um pet for removido, ele sera deletado do bd
    @JsonManagedReference

    private List<Livro> livros;
}
