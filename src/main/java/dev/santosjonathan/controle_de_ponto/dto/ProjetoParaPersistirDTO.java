package dev.santosjonathan.controle_de_ponto.dto;

import java.time.Instant;
import java.util.UUID;

public record ProjetoParaPersistirDTO(String nome, String descricao, Instant dataInicio, Instant dataTerminoPrevista, Instant dataTermino, UUID idResponsavel) {
}
