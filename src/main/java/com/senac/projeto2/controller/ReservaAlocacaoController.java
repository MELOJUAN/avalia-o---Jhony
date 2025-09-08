package com.senac.projeto2.controller;

import com.senac.projeto2.entity.ReservaAlocacao;
import com.senac.projeto2.service.ReservaAlocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reserva-alocacao")
public class ReservaAlocacaoController {

    @Autowired
    private ReservaAlocacaoService service;

    @GetMapping
    public ResponseEntity<List<ReservaAlocacao>> listarTodos() {
        List<ReservaAlocacao> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<ReservaAlocacao> salvar(@RequestBody ReservaAlocacao reservaAlocacao) {
        ReservaAlocacao nova = service.salvar(reservaAlocacao);
        return ResponseEntity.ok(nova);
    }
}