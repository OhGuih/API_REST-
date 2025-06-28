package com.primeiraapi.primeiraapi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "aluno")
@PrimaryKeyJoinColumn(name = "idPessoa")
public class AlunoModel extends PessoaModel {

    private String curso;
    private String emailInstitucional;
    private String campus;
    private String periodoEntrada;
    private String polo;
    private String situacao;
    private String turno;
    private String cep;
    private String coordenacao;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEmailInstitucional() {
        return emailInstitucional;
    }

    public void setEmailInstitucional(String emailInstitucional) {
        this.emailInstitucional = emailInstitucional;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getPeriodoEntrada() {
        return periodoEntrada;
    }

    public void setPeriodoEntrada(String periodoEntrada) {
        this.periodoEntrada = periodoEntrada;
    }

    public String getPolo() {
        return polo;
    }

    public void setPolo(String polo) {
        this.polo = polo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCoordenacao() {
        return coordenacao;
    }

    public void setCoordenacao(String coordenacao) {
        this.coordenacao = coordenacao;
    }
}
