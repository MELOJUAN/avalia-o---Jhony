package com.senac.projeto2.service;

import com.senac.projeto2.entity.Ambiente;
import com.senac.projeto2.repository.AmbienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AmbienteService {

    @Autowired
    private AmbienteRepository ambienteRepository;

    public List<Ambiente> listarTodos() {
        return ambienteRepository.findAll();
    }

    public Ambiente salvar(Ambiente ambiente) {
        return ambienteRepository.save(ambiente);
    }
}