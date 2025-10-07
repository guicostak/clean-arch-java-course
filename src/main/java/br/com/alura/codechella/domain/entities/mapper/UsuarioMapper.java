package br.com.alura.codechella.domain.entities.mapper;

import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.entrypoint.dto.response.UsuarioResponse;

public class UsuarioMapper {
    public UsuarioResponse modelToResponse(Usuario usuario) {
        return new UsuarioResponse(
                usuario.getCpf(),
                usuario.getNome(),
                usuario.getNascimento(),
                usuario.getEmail());
    }
}

