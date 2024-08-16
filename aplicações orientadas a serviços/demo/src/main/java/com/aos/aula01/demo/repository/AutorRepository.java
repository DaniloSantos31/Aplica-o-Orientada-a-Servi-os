package com.aos.aula01.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aos.aula01.demo.model.Autor;
import java.util.List;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    public Autor findByCpf(String cpf);

    public List<Autor> findByIdade(Short idade);

    public void deletByCpf(String cpf);
    
}
