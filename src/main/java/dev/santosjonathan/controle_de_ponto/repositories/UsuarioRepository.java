package dev.santosjonathan.controle_de_ponto.repositories;

import dev.santosjonathan.controle_de_ponto.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
