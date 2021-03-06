package br.com.zup.edu.cineminha.adapters.persistence.filmes;

import br.com.zup.edu.cineminha.domain.filmes.Filme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
}