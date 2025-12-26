package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Embeddable
public class SaidaKey implements Serializable {
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "codigo_usuario")
    private Usuario usuario;

    private LocalDateTime horario;

    public SaidaKey() {}

    public SaidaKey(Usuario usuario, LocalDateTime horario) {
        this.usuario = usuario;
        this.horario = horario;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SaidaKey that = (SaidaKey) o;
        return Objects.equals(usuario, that.usuario) && Objects.equals(horario, that.horario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usuario, horario);
    }
}
