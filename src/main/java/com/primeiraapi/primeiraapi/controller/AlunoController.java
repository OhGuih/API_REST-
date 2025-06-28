package com.primeiraapi.primeiraapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiraapi.primeiraapi.model.AlunoModel;
import com.primeiraapi.primeiraapi.service.AlunoService;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<AlunoModel> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.of(service.buscarPorId(id));
    }

    @PostMapping
    public AlunoModel salvar(@RequestBody AlunoModel aluno) {
        return service.salvar(aluno);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AlunoModel> atualizar(@PathVariable Long id, @RequestBody AlunoModel novo) {
        return ResponseEntity.ok(service.atualizar(id, novo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/nome/{nome}")
    public List<AlunoModel> buscarPorNome(@PathVariable String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/curso/{curso}")
    public List<AlunoModel> buscarPorCurso(@PathVariable String curso) {
        return service.buscarPorCurso(curso);
    }

    @GetMapping("/campus/{campus}")
    public List<AlunoModel> buscarPorCampus(@PathVariable String campus) {
        return service.buscarPorCampus(campus);
    }
}
