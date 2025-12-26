package dev.santosjonathan.controle_de_ponto.repositories;

import dev.santosjonathan.controle_de_ponto.entities.Entrada;
import dev.santosjonathan.controle_de_ponto.entities.Saida;
import dev.santosjonathan.controle_de_ponto.entities.SaidaKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.List;

public interface SaidaRepository extends JpaRepository<Saida, SaidaKey> {
    @Query("SELECT e FROM Saida e WHERE e.saidaKey.horario BETWEEN :inicio AND :fim")
    List<Saida> buscarPorPeriodo(
            @Param("inicio") LocalDateTime inicio,
            @Param("fim") LocalDateTime fim
    );

    @Query("SELECT e FROM Saida e WHERE e.saidaKey.usuario.id = :codigo AND e.saidaKey.horario BETWEEN :inicio AND :fim")
    List<Saida> buscarPorPeriodo(
            @Param("codigo") Long codigo,
            @Param("inicio") LocalDateTime inicio,
            @Param("fim") LocalDateTime fim
    );
}
