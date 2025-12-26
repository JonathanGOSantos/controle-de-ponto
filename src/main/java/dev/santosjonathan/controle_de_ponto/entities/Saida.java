package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "saidas")
public class Saida implements Serializable {
    @EmbeddedId
    private SaidaKey saidaKey;

    public Saida() {}

    public Saida(SaidaKey saidaKey) {
        this.saidaKey = saidaKey;
    }

    public SaidaKey getSaidaKey() {
        return saidaKey;
    }

    public void setSaidaKey(SaidaKey saidaKey) {
        this.saidaKey = saidaKey;
    }

    public Usuario getUsuario() {
        return this.saidaKey.getUsuario();
    }

    public void setUsuario(Usuario usuario) {
        this.saidaKey.setUsuario(usuario);
    }

    public LocalDateTime getHorario() {
        return this.saidaKey.getHorario();
    }

    public void setHorario(LocalDateTime horario) {
        this.saidaKey.setHorario(horario);
    }
}
