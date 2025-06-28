package com.primeiraapi.primeiraapi.service;

import com.primeiraapi.primeiraapi.model.AlunoModel;
import com.primeiraapi.primeiraapi.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<AlunoModel> listarTodos() {
        return repository.findAll();
    }

    public AlunoModel salvar(AlunoModel aluno) {
        return repository.save(aluno);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

    public Optional<AlunoModel> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public List<AlunoModel> buscarPorNome(String nome) {
        return repository.findByNomeEstudanteContainingIgnoreCase(nome);
    }

    public List<AlunoModel> buscarPorCurso(String curso) {
        return repository.findByCursoContainingIgnoreCase(curso);
    }

    public List<AlunoModel> buscarPorSexo(String sexo) {
        return repository.findBySexoIgnoreCase(sexo);
    }

    public AlunoModel atualizar(Long id, AlunoModel novo) {
        return repository.findById(id).map(aluno -> {
            aluno.setNomeEstudante(novo.getNomeEstudante());
            aluno.setIdade(novo.getIdade());
            aluno.setSexo(novo.getSexo());
            aluno.setCurso(novo.getCurso());
            aluno.setEmailInstitucional(novo.getEmailInstitucional());
            aluno.setCampus(novo.getCampus());
            aluno.setPeriodoEntrada(novo.getPeriodoEntrada());
            aluno.setPolo(novo.getPolo());
            aluno.setSituacao(novo.getSituacao());
            aluno.setTurno(novo.getTurno());
            aluno.setCep(novo.getCep());
            aluno.setCoordenacao(novo.getCoordenacao());
            return repository.save(aluno);
        }).orElseThrow(() -> new RuntimeException("Aluno não encontrado"));
    }
}
