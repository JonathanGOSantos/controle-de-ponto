package dev.santosjonathan.controle_de_ponto.infrastructure.repository;

import dev.santosjonathan.controle_de_ponto.infrastructure.entity.Equipe;
import dev.santosjonathan.controle_de_ponto.infrastructure.entity.Projeto;
import dev.santosjonathan.controle_de_ponto.infrastructure.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Set;
import java.util.UUID;

public interface ProjetoRepository extends JpaRepository<Projeto, UUID> {
    Set<Projeto> findByResponsavel(Usuario responsavel);

    @Query("SELECT p FROM Projeto p JOIN p.projetosEquipes pe WHERE pe.equipe = :equipe")
    Set<Projeto> findByEquipe(@Param("equipe") Equipe equipe);

    @Query("SELECT p FROM Projeto p JOIN p.projetosEquipes pe JOIN pe.equipe.membrosEquipes me WHERE me.membro = :usuario")
    Set<Projeto> findByMembro(@Param("usuario") Usuario usuario);
}
