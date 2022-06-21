package br.com.zup.edu.cineminha.adapters.persistence.salas;

import br.com.zup.edu.cineminha.domain.salas.Sala;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalaRepository extends JpaRepository<Sala, Long> {
}