package dev.santosjonathan.controle_de_ponto.dtos;

import java.time.LocalDateTime;

public record EntradaRegistro(Long codigo, LocalDateTime horario) {
}