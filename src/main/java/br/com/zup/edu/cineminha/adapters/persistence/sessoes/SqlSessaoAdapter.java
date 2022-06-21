package br.com.zup.edu.cineminha.adapters.persistence.sessoes;

import br.com.zup.edu.cineminha.domain.sessoes.CadastraNovaSessaoRepository;
import br.com.zup.edu.cineminha.domain.sessoes.Sessao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SqlSessaoAdapter implements CadastraNovaSessaoRepository {

    @Autowired
    private SessaoRepository repository;

    @Override
    public Sessao salva(Sessao sessao) {
        return repository.save(sessao);
    }

}
