package dev.santosjonathan.controle_de_ponto.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "equipes")
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @CreationTimestamp
    private Instant criadoEm;

    @UpdateTimestamp
    private Instant atualizadoEm;

    private Instant deletadoEm;

    @OneToMany(mappedBy = "equipe", fetch = FetchType.LAZY)
    private Set<MembroEquipe> membrosEquipes;

    @OneToMany(mappedBy = "equipe", fetch = FetchType.LAZY)
    private Set<ProjetoEquipe> projetosEquipes;
}
