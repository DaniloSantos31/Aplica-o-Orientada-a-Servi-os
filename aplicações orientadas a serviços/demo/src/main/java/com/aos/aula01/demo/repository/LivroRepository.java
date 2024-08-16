package com.aos.aula01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula01.demo.model.Livro;
import java.util.List;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{

    public Livro findByNome (String nome);

    public Livro findByGenero(String genero);

    public Livro findByTitulo(String titulo);
    
    
}
