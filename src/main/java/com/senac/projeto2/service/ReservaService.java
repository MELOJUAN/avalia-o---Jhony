package com.senac.projeto2.service;

import com.senac.projeto2.entity.Reserva;
import com.senac.projeto2.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    @Autowired
    private ReservaRepository repository;

    public List<Reserva> listarTodos() {
        return repository.findAll();
    }

    public Reserva salvar(Reserva reserva) {
        return repository.save(reserva);
    }
}