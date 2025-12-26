package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "entradas")
public class Entrada implements Serializable {
    @EmbeddedId
    private EntradaKey entradaKey;

    public Entrada() {}

    public Entrada(EntradaKey entradaKey) {
        this.entradaKey = entradaKey;
    }

    public EntradaKey getEntradaKey() {
        return entradaKey;
    }

    public void setEntradaKey(EntradaKey entradaKey) {
        this.entradaKey = entradaKey;
    }

    public Usuario getUsuario() {
        return this.entradaKey.getUsuario();
    }

    public void setUsuario(Usuario usuario) {
        this.entradaKey.setUsuario(usuario);
    }

    public LocalDateTime getHorario() {
        return this.entradaKey.getHorario();
    }

    public void setHorario(LocalDateTime horario) {
        this.entradaKey.setHorario(horario);
    }
}
