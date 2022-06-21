package br.com.zup.edu.cineminha.adapters.persistence.filmes;

import br.com.zup.edu.cineminha.domain.filmes.CadastraNovoFilmeRepository;
import br.com.zup.edu.cineminha.domain.filmes.Filme;
import br.com.zup.edu.cineminha.domain.filmes.RetornaFilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlFilmeAdapter implements CadastraNovoFilmeRepository, RetornaFilmeRepository {

    @Autowired
    private FilmeRepository repository;

    @Override
    public Filme salva(Filme filme) {
        return repository.save(filme);
    }

    @Override
    public Optional<Filme> retorna(Long id) {
        return repository.findById(id);
    }

}
