package br.com.alura.codechella.config;

import br.com.alura.codechella.application.usecases.CriarUsuarioUseCase;
import br.com.alura.codechella.domain.entities.mapper.UsuarioMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {

    @Bean
    public CriarUsuarioUseCase criarUsuarioUseCase() {
        return new CriarUsuarioUseCase();
    }

    @Bean
    public UsuarioMapper usuarioMapper() {
        return new UsuarioMapper();
    }
}
