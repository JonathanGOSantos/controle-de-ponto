package dev.santosjonathan.controle_de_ponto.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@Entity
@Table(name = "projetos_equipes")
@SQLDelete(sql = "UPDATE projetos_equipes SET deletado_em = NOW() WHERE id = ?")
@SQLRestriction("deletado_em IS NULL")
public class ProjetoEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @CreationTimestamp
    private Instant criadoEm;

    @UpdateTimestamp
    private Instant atualizadoEm;

    private Instant deletadoEm;

    @ManyToOne
    @JoinColumn(name = "id_equipe")
    private Equipe equipe;

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    private Projeto projeto;
}
