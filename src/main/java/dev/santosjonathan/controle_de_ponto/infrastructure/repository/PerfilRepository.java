package dev.santosjonathan.controle_de_ponto.infrastructure.repository;

import dev.santosjonathan.controle_de_ponto.infrastructure.entity.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface PerfilRepository extends JpaRepository<Perfil, UUID> {
    @Query("SELECT p FROM Perfil p WHERE p.nome = :nome")
    Perfil findByNome(@Param("nome") String nome);
}
