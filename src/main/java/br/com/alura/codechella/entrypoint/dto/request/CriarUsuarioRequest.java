package br.com.alura.codechella.entrypoint.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CriarUsuarioRequest {
    private String cpf;
    private String nome;
    private LocalDateTime dataNascimento;
}
