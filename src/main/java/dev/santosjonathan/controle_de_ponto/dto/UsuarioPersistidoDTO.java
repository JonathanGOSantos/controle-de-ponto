package dev.santosjonathan.controle_de_ponto.dto;

import java.util.UUID;

public record UsuarioPersistidoDTO(UUID id, String nome, String email, String documento, String perfil) {
}
