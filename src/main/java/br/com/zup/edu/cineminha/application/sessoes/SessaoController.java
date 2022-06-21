package br.com.zup.edu.cineminha.application.sessoes;

import br.com.zup.edu.cineminha.adapters.persistence.filmes.FilmeRepository;
import br.com.zup.edu.cineminha.adapters.persistence.salas.SalaRepository;
import br.com.zup.edu.cineminha.adapters.persistence.sessoes.SessaoRepository;
import br.com.zup.edu.cineminha.domain.filmes.CadastraNovoFilme;
import br.com.zup.edu.cineminha.domain.sessoes.CadastraNovaSessao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/sessoes")
public class SessaoController {

    @Autowired
    private CadastraNovaSessao service;

    @PostMapping
    public ResponseEntity<?> cadastra(@RequestBody @Valid NovaSessaoRequest request,
                                      UriComponentsBuilder uriBuilder) {

        var sessao = service.cadastra(request);

        var location = uriBuilder.path("/api/sessoes/{id}")
                .buildAndExpand(sessao.getId())
                .toUri();

        return ResponseEntity.created(location).build();
    }


}
