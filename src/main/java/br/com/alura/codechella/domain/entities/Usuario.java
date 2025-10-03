package br.com.alura.codechella.domain.entities;

import java.time.LocalDate;

public class Usuario {

    private Long id;
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    public Usuario() {}

    public Usuario(String cpf, Long id, String nome, LocalDate nascimento, String email) {
        this.cpf = cpf;
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public String getEmail() {
        return email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Long getId() {
        return id;
    }
}
