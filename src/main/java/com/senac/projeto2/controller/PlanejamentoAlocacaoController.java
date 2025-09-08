package com.senac.projeto2.controller;

import com.senac.projeto2.entity.PlanejamentoAlocacao;
import com.senac.projeto2.service.PlanejamentoAlocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planejamento-alocacao")
public class PlanejamentoAlocacaoController {

    @Autowired
    private PlanejamentoAlocacaoService service;

    @GetMapping
    public ResponseEntity<List<PlanejamentoAlocacao>> listarTodos() {
        List<PlanejamentoAlocacao> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<PlanejamentoAlocacao> salvar(@RequestBody PlanejamentoAlocacao planejamento) {
        PlanejamentoAlocacao novo = service.salvar(planejamento);
        return ResponseEntity.ok(novo);
    }
}