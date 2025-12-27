package dev.santosjonathan.controle_de_ponto.dto;

import dev.santosjonathan.controle_de_ponto.entity.Execucao;

import java.time.Instant;
import java.util.UUID;

public record ExecucaoParaPersistirDTO(UUID idUsuario, Instant entrada, Instant saida, UUID idProjeto) {
}
