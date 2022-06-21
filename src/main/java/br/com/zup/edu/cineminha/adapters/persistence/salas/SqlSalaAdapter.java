package br.com.zup.edu.cineminha.adapters.persistence.salas;

import br.com.zup.edu.cineminha.domain.salas.CadastraNovaSalaRepository;
import br.com.zup.edu.cineminha.domain.salas.RetornaSalaRepository;
import br.com.zup.edu.cineminha.domain.salas.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class SqlSalaAdapter implements CadastraNovaSalaRepository, RetornaSalaRepository {

    @Autowired
    private SalaRepository repository;

    @Override
    public Sala salva(Sala sala) {
        return repository.save(sala);
    }

    @Override
    public Optional<Sala> retorna(Long id) {
        return repository.findById(id);
    }

}
