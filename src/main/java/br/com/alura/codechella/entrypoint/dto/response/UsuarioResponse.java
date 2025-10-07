package br.com.alura.codechella.entrypoint.dto.response;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UsuarioResponse {
    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private String email;

    public UsuarioResponse(String cpf, String nome, LocalDate nascimento, String email) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.email = email;
    }
}
