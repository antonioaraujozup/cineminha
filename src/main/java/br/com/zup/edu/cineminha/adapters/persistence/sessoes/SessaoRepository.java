package br.com.zup.edu.cineminha.adapters.persistence.sessoes;

import br.com.zup.edu.cineminha.domain.sessoes.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessaoRepository extends JpaRepository<Sessao, Long> {
}