package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.*;

import java.io.Serializable;
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
}
