package br.com.zup.edu.cineminha.domain.filmes;

import java.util.Optional;

public interface RetornaFilmeRepository {

    Optional<Filme> retorna(Long id);

}
