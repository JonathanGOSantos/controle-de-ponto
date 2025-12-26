package dev.santosjonathan.controle_de_ponto.repositories;

import dev.santosjonathan.controle_de_ponto.entities.Saida;
import dev.santosjonathan.controle_de_ponto.entities.SaidaKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaidaRepository extends JpaRepository<Saida, SaidaKey> {
}
