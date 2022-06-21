package br.com.zup.edu.cineminha.domain.salas;

import java.util.Optional;

public interface RetornaSalaRepository {

    Optional<Sala> retorna(Long id);

}
