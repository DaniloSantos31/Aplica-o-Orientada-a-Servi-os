package com.aos.aula01.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.aos.aula01.demo.model.Editora;

public class EditoraService {

    @Autowired
    private EditoraService editRepo;

    public Editora buscarPeloCnpj(String cnpj){
        return editRepo.findByCnpj(cnpj);
    }

    public List<Editora> retornarTodasEditoras(){
        return editRepo.findAll();
    }

    
}
