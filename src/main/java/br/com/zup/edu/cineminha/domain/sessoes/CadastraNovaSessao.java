package br.com.zup.edu.cineminha.domain.sessoes;

import br.com.zup.edu.cineminha.domain.filmes.RetornaFilmeRepository;
import br.com.zup.edu.cineminha.domain.salas.RetornaSalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastraNovaSessao {

    @Autowired
    private RetornaSalaRepository retornaSalaRepository;

    @Autowired
    private RetornaFilmeRepository retornaFilmeRepository;

    @Autowired
    private CadastraNovaSessaoRepository cadastraNovaSessaoRepository;

    public Sessao cadastra(DadosNovaSessao dadosNovaSessao) {
        Sessao sessao = dadosNovaSessao.toModel(retornaSalaRepository, retornaFilmeRepository);

        return cadastraNovaSessaoRepository.salva(sessao);
    }

}
