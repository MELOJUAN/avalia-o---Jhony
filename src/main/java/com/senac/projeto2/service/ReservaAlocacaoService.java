package com.senac.projeto2.service;

import com.senac.projeto2.entity.ReservaAlocacao;
import com.senac.projeto2.repository.ReservaAlocacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaAlocacaoService {

    @Autowired
    private ReservaAlocacaoRepository repository;

    public List<ReservaAlocacao> listarTodos() {
        return repository.findAll();
    }

    public ReservaAlocacao salvar(ReservaAlocacao reservaAlocacao) {
        return repository.save(reservaAlocacao);
    }
}