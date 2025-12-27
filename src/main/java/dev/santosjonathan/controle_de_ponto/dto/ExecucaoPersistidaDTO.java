package dev.santosjonathan.controle_de_ponto.dto;

import java.time.Instant;
import java.util.UUID;

public record ExecucaoPersistidaDTO(UUID id, UUID idUsuario, Instant entrada, Instant saida, UUID idProjeto) {
}
