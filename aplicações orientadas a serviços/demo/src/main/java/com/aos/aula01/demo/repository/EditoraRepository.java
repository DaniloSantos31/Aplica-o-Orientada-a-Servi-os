package com.aos.aula01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula01.demo.model.Editora;
import java.util.List;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{

    public Editora findByCnpj(String cnpj);

    public List<Editora> findByNome(String nome);
    
}
