package com.primeiraapi.primeiraapi.controller;

import java.util.List;

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

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }

    @GetMapping
    public List<AlunoModel> listarTodos() {
        return service.listarTodos();
    }

    @PostMapping
    public AlunoModel salvar(@RequestBody AlunoModel aluno) {
        return service.salvar(aluno);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AlunoModel> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public AlunoModel atualizar(@PathVariable Long id, @RequestBody AlunoModel aluno) {
        return service.atualizar(id, aluno);
    }

    @GetMapping("/nome/{nome}")
    public List<AlunoModel> buscarPorNome(@PathVariable String nome) {
        return service.buscarPorNome(nome);
    }

    @GetMapping("/curso/{curso}")
    public List<AlunoModel> buscarPorCurso(@PathVariable String curso) {
        return service.buscarPorCurso(curso);
    }

    @GetMapping("/sexo/{sexo}")
    public List<AlunoModel> buscarPorSexo(@PathVariable String sexo) {
        return service.buscarPorSexo(sexo);
    }
}
