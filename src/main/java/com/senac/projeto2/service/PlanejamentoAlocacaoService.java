package com.senac.projeto2.service;

import com.senac.projeto2.entity.PlanejamentoAlocacao;
import com.senac.projeto2.repository.PlanejamentoAlocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanejamentoAlocacaoService {

    @Autowired
    private PlanejamentoAlocacaoRepository repository;

    public List<PlanejamentoAlocacao> listarTodos() {
        return repository.findAll();
    }

    public PlanejamentoAlocacao salvar(PlanejamentoAlocacao planejamento) {
        return repository.save(planejamento);
    }
}