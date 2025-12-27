package dev.santosjonathan.controle_de_ponto.repository;

import dev.santosjonathan.controle_de_ponto.entity.Execucao;
import dev.santosjonathan.controle_de_ponto.entity.Projeto;
import dev.santosjonathan.controle_de_ponto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;
import java.util.UUID;

public interface ExecucaoRepository extends JpaRepository<Execucao, UUID> {
    Set<Execucao> findByUsuario(Usuario usuario);

    Set<Execucao> findByProjeto(Projeto projeto);
}
