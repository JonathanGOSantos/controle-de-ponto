package dev.santosjonathan.controle_de_ponto.dto;

import dev.santosjonathan.controle_de_ponto.entity.Equipe;

import java.util.UUID;

public record EquipePersistidaDTO(UUID id, String nome) {
}
