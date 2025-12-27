package dev.santosjonathan.controle_de_ponto.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.Set;
import java.util.UUID;

@Data
@Entity
@Table(name = "usuarios")
@SQLDelete(sql = "UPDATE usuarios SET deletado_em = NOW() WHERE id = ?")
@SQLRestriction("deletado_em IS NULL")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String documento;

    @Column(nullable = false)
    private String senha;

    @CreationTimestamp
    private Instant criadoEm;

    @UpdateTimestamp
    private Instant atualizadoEm;

    private Instant deletadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private Set<MembroEquipe> membrosEquipes;

    @OneToMany(mappedBy = "responsavel", fetch = FetchType.LAZY)
    private Set<Projeto> projetos;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private Set<Execucao> execucoes;
}
