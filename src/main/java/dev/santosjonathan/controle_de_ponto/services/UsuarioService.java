package dev.santosjonathan.controle_de_ponto.services;

import dev.santosjonathan.controle_de_ponto.entities.Usuario;
import dev.santosjonathan.controle_de_ponto.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Transactional
    public Usuario salvar(String name) {
        Usuario usuario = new Usuario();
        usuario.setName(name);
        return usuarioRepository.save(usuario);
    }

    @Transactional
    public Optional<Usuario> buscarPorCodigo(Long codigo) {
        return usuarioRepository.findById(codigo);
    }
}
