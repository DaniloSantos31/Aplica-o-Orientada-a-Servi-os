package com.aos.aula01.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aos.aula01.demo.model.Livro;

public class LivroService {
    
    @Autowired
    private LivroService livRepo;

    public List<Livro> retornarTodosOsLivros(){
        return livRepo.findAll();
    }

    public Livro buscarPeloTitulo (String titulo){
        return livRepo.findByTitulo(titulo);
    }
}
