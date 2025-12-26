package dev.santosjonathan.controle_de_ponto.repositories;

import dev.santosjonathan.controle_de_ponto.entities.Entrada;
import dev.santosjonathan.controle_de_ponto.entities.EntradaKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface EntradaRepository extends JpaRepository<Entrada, EntradaKey> {
    @Query("SELECT e FROM Entrada e WHERE e.entradaKey.horario BETWEEN :inicio AND :fim")
    List<Entrada> buscarPorPeriodo(
            @Param("inicio") LocalDateTime inicio,
            @Param("fim") LocalDateTime fim
    );

    @Query("SELECT e FROM Entrada e WHERE e.entradaKey.usuario.id = :codigo AND e.entradaKey.horario BETWEEN :inicio AND :fim")
    List<Entrada> buscarPorPeriodo(
            @Param("codigo") Long codigo,
            @Param("inicio") LocalDateTime inicio,
            @Param("fim") LocalDateTime fim
    );
}
