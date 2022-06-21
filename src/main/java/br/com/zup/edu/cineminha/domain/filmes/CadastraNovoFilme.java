package br.com.zup.edu.cineminha.domain.filmes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovoFilme {

    @Autowired
    private CadastraNovoFilmeRepository repository;

    public Filme cadastra(DadosNovoFilme dadosNovoFilme) {
        Filme filme = dadosNovoFilme.toModel();

        return repository.salva(filme);
    }

}
