package dev.santosjonathan.controle_de_ponto.repository;

import dev.santosjonathan.controle_de_ponto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    Usuario findByEmail(@Param("email") String email);

    @Query("SELECT u FROM Usuario u WHERE u.documento = :documento")
    Usuario findByDocumento(@Param("documento") String documento);
}
