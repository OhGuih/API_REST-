package com.primeiraapi.primeiraapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiraapi.primeiraapi.model.AlunoModel;

public interface AlunoRepository extends JpaRepository<AlunoModel, Long> {
    List<AlunoModel> findByNomeEstudanteContainingIgnoreCase(String nome);

    List<AlunoModel> findByCursoContainingIgnoreCase(String curso);

    List<AlunoModel> findBySexoIgnoreCase(String sexo);
}
