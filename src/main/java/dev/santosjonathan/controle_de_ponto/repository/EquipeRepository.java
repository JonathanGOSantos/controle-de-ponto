package dev.santosjonathan.controle_de_ponto.repository;

import dev.santosjonathan.controle_de_ponto.entity.Equipe;
import dev.santosjonathan.controle_de_ponto.entity.Projeto;
import dev.santosjonathan.controle_de_ponto.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;
import java.util.UUID;

public interface EquipeRepository extends JpaRepository<Equipe, UUID> {
    @Query("SELECT e FROM Equipe e JOIN e.membrosEquipes me WHERE me.membro = :usuario")
    Set<Equipe> findByMembro(@Param("usuario") Usuario usuario);

    @Query("SELECT e FROM Equipe e JOIN e.projetosEquipes pe WHERE pe.projeto = :projeto")
    Set<Equipe> findByProjeto(@Param("projeto") Projeto projeto);
}
