package br.com.zup.edu.cineminha.domain.sessoes;

import br.com.zup.edu.cineminha.domain.filmes.RetornaFilmeRepository;
import br.com.zup.edu.cineminha.domain.salas.RetornaSalaRepository;

public interface DadosNovaSessao {

    Sessao toModel(RetornaSalaRepository retornaSalaRepository, RetornaFilmeRepository retornaFilmeRepository);

}
