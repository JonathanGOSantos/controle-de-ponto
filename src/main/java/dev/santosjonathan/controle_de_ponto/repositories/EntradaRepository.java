package dev.santosjonathan.controle_de_ponto.repositories;

import dev.santosjonathan.controle_de_ponto.entities.Entrada;
import dev.santosjonathan.controle_de_ponto.entities.EntradaKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntradaRepository extends JpaRepository<Entrada, EntradaKey> {
}
