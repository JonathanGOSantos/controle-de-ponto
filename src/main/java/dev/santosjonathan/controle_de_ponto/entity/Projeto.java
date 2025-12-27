package dev.santosjonathan.controle_de_ponto.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "projetos")
public class Projeto implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private Instant dataInicio;

    @Column(nullable = false)
    private Instant dataTermino;

    private Instant dataTerminoPrevista;

    @CreationTimestamp
    private Instant criadoEm;

    @UpdateTimestamp
    private Instant atualizadoEm;

    private Instant deletadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_responsavel")
    private Usuario responsavel;

    @OneToMany(mappedBy = "projeto", fetch = FetchType.LAZY)
    private Set<ProjetoEquipe> projetosEquipes;

    @OneToMany(mappedBy = "projeto", fetch = FetchType.LAZY)
    private Set<Execucao> execucoes;
}
