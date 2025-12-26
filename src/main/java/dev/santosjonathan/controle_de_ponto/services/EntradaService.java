package dev.santosjonathan.controle_de_ponto.services;

import dev.santosjonathan.controle_de_ponto.dtos.EntradaRegistro;
import dev.santosjonathan.controle_de_ponto.entities.Entrada;
import dev.santosjonathan.controle_de_ponto.repositories.EntradaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Service
public class EntradaService {
    private final EntradaRepository entradaRepository;

    public EntradaService(EntradaRepository entradaRepository) {
        this.entradaRepository = entradaRepository;
    }

    public Entrada registrar(EntradaRegistro entradaRegistro) {
        Entrada entrada = new Entrada();
        entrada.setHorario(entradaRegistro.horario());
        return entradaRepository.save(entrada);
    }

    public Set<Entrada> buscarTodas() {
        return new HashSet<>(entradaRepository.findAll());
    }

    public Set<Entrada> buscarPorPeriodo(LocalDate inicio, LocalDate fim) {
        return new HashSet<>(entradaRepository.buscarPorPeriodo(inicio.atTime(0,0), fim.atTime(0, 0)));
    }

    public Set<Entrada> buscarPorPeriodo(Long codigo, LocalDate inicio, LocalDate fim) {
        return new HashSet<>(entradaRepository.buscarPorPeriodo(codigo, inicio.atTime(0,0), fim.atTime(0, 0)));
    }
}
