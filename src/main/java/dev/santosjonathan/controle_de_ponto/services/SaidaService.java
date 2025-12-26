package dev.santosjonathan.controle_de_ponto.services;

import dev.santosjonathan.controle_de_ponto.dtos.SaidaRegistro;
import dev.santosjonathan.controle_de_ponto.entities.Saida;
import dev.santosjonathan.controle_de_ponto.repositories.SaidaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Service
public class SaidaService {
    private final SaidaRepository saidaRepository;

    public SaidaService(SaidaRepository saidaRepository) {
        this.saidaRepository = saidaRepository;
    }

    public Saida registrar(SaidaRegistro saidaRegistro) {
        Saida saida = new Saida();
        saida.setHorario(saidaRegistro.horario());
        return saidaRepository.save(saida);
    }

    public Set<Saida> buscarTodas() {
        return new HashSet<>(saidaRepository.findAll());
    }

    public Set<Saida> buscarPorPeriodo(LocalDate inicio, LocalDate fim) {
        return new HashSet<>(saidaRepository.buscarPorPeriodo(inicio.atTime(0,0), fim.atTime(0, 0)));
    }

    public Set<Saida> buscarPorPeriodo(Long codigo, LocalDate inicio, LocalDate fim) {
        return new HashSet<>(saidaRepository.buscarPorPeriodo(codigo, inicio.atTime(0,0), fim.atTime(0, 0)));
    }
}
