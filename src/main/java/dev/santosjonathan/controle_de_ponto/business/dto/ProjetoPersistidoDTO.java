package dev.santosjonathan.controle_de_ponto.business.dto;

import dev.santosjonathan.controle_de_ponto.infrastructure.entity.Equipe;

import java.time.Instant;
import java.util.Set;
import java.util.UUID;

public record ProjetoPersistidoDTO(UUID id, String nome, String descricao, Instant dataInicio, Instant dataTerminoPrevista, Instant dataTermino, UUID responsavel, Set<Equipe> equipes) {
}
