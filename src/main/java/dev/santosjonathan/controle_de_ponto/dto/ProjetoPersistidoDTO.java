package dev.santosjonathan.controle_de_ponto.dto;

import dev.santosjonathan.controle_de_ponto.entity.Equipe;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record ProjetoPersistidoDTO(UUID id, String nome, String descricao, Instant dataInicio, Instant dataTerminoPrevista, Instant dataTermino, UUID responsavel, Set<Equipe> equipes) {
}
