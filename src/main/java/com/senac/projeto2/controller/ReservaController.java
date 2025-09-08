package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Reserva;
import com.senac.projeto2.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reservas")
public class ReservaController {

    @Autowired
    private ReservaService service;

    @GetMapping
    public ResponseEntity<List<Reserva>> listarTodos() {
        List<Reserva> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<Reserva> salvar(@RequestBody Reserva reserva) {
        Reserva nova = service.salvar(reserva);
        return ResponseEntity.ok(nova);
    }
}