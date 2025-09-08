package com.senac.projeto2.service;

import com.senac.projeto2.entity.Sala;
import com.senac.projeto2.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    private SalaRepository salaRepository;

    public List<Sala> listarTodos() {
        return salaRepository.findAll();
    }

    public Sala salvar(Sala sala) {
        return salaRepository.save(sala);
    }
}