package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.*;

import java.io.Serializable;
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
}
