package br.com.alura.codechella.entrypoint.controllers;

import br.com.alura.codechella.application.usecases.CriarUsuarioUseCase;
import br.com.alura.codechella.domain.entities.mapper.UsuarioMapper;
import br.com.alura.codechella.entrypoint.dto.request.CriarUsuarioRequest;
import br.com.alura.codechella.entrypoint.dto.response.UsuarioResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final CriarUsuarioUseCase criarUsuarioUseCase;
    private final UsuarioMapper usuarioMapper;

    @PostMapping
    public UsuarioResponse criarUsuario(@RequestBody CriarUsuarioRequest request) {
        return usuarioMapper.modelToResponse(criarUsuarioUseCase.execute());
    }
}
