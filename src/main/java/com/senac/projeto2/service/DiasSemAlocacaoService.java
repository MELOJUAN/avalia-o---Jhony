package com.senac.projeto2.service;

import com.senac.projeto2.entity.DiasSemAlocacao;
import com.senac.projeto2.repository.DiasSemAlocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiasSemAlocacaoService {

    @Autowired
    private DiasSemAlocacaoRepository repository;

    public List<DiasSemAlocacao> listarTodos() {
        return repository.findAll();
    }

    public DiasSemAlocacao salvar(DiasSemAlocacao diasSemAlocacao) {
        return repository.save(diasSemAlocacao);
    }
}