package com.senac.projeto2.service;

import com.senac.projeto2.entity.RegistroUtilizacaoAmbiente;
import com.senac.projeto2.repository.RegistroUtilizacaoAmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroUtilizacaoAmbienteService {

    @Autowired
    private RegistroUtilizacaoAmbienteRepository repository;

    public List<RegistroUtilizacaoAmbiente> listarTodos() {
        return repository.findAll();
    }

    public RegistroUtilizacaoAmbiente salvar(RegistroUtilizacaoAmbiente registro) {
        return repository.save(registro);
    }
}