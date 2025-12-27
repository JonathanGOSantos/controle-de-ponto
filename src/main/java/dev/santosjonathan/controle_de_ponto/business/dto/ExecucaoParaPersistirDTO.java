package dev.santosjonathan.controle_de_ponto.business.dto;

import java.time.Instant;
import java.util.UUID;

public record ExecucaoParaPersistirDTO(UUID idUsuario, Instant entrada, Instant saida, UUID idProjeto) {
}
