package com.aos.aula01.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aos.aula01.demo.model.Autor;
import com.aos.aula01.demo.repository.AutorRepository;

public class AutorService {

    @Autowired
    private AutorRepository autorRepo;

    public void inserirAutor(Autor autor){
        autorRepo.save(autor);
    }

    public List<Autor> retornarTodosAutores(){
        return autorRepo.findAll();
    }

    public Autor buscarPeloCpf(String cpf){
        return autorRepo.findByCpf(cpf);
    }
    
    public Autor buscarAutoresPelaIdade(Short idade){
        return autorRepo.findByIdade(idade);
    }
    
}
