package br.com.zup.edu.cineminha.application.sessoes;

import br.com.zup.edu.cineminha.domain.filmes.RetornaFilmeRepository;
import br.com.zup.edu.cineminha.domain.salas.RetornaSalaRepository;
import br.com.zup.edu.cineminha.domain.sessoes.DadosNovaSessao;
import br.com.zup.edu.cineminha.domain.sessoes.Sessao;
import br.com.zup.edu.cineminha.adapters.persistence.filmes.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.salas.SalaRepository;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalTime;

public class NovaSessaoRequest implements DadosNovaSessao {

    @NotNull
    private LocalTime horario;

    @Positive
    private long salaId;

    @Positive
    private long filmeId;

    @Positive
    private BigDecimal preco;

    public LocalTime getHorario() {
        return horario;
    }

    public long getSalaId() {
        return salaId;
    }

    public long getFilmeId() {
        return filmeId;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public Sessao toModel(RetornaSalaRepository salas, RetornaFilmeRepository filmes) {

        var sala = salas.retorna(salaId).orElseThrow(() -> new IllegalStateException("Sala nao existe"));
        var filme = filmes.retorna(filmeId).orElseThrow(() -> new IllegalStateException("Filme nao existe"));

        return new Sessao(horario, sala, filme, preco);

    }
}
