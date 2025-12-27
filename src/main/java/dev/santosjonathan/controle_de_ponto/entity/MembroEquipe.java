package dev.santosjonathan.controle_de_ponto.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;
import org.hibernate.annotations.UpdateTimestamp;

import java.io.Serializable;
import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "membros_equipes")
@SQLDelete(sql = "UPDATE membros_equipes SET deletado_em = NOW() WHERE id = ?")
@SQLRestriction("deletado_em IS NULL")
public class MembroEquipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Boolean responsavel;

    @CreationTimestamp
    private Instant criadoEm;

    @UpdateTimestamp
    private Instant atualizadoEm;

    private Instant deletadoEm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario membro;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_equipe")
    private Equipe equipe;
}
