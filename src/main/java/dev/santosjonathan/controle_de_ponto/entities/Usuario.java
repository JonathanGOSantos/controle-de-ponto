package dev.santosjonathan.controle_de_ponto.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "entradaKey.usuario", fetch = FetchType.LAZY)
    private Set<Entrada> entradas;

    @OneToMany(mappedBy = "saidaKey.usuario", fetch = FetchType.LAZY)
    private Set<Saida> saidas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Entrada> getEntradas() {
        return entradas;
    }

    public void setEntradas(Set<Entrada> entradas) {
        this.entradas = entradas;
    }

    public Set<Saida> getSaidas() {
        return saidas;
    }

    public void setSaidas(Set<Saida> saidas) {
        this.saidas = saidas;
    }
}
