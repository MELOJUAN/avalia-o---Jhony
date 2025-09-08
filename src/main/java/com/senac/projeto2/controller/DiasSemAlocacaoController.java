package com.senac.projeto2.controller;

import com.senac.projeto2.entity.DiasSemAlocacao;
import com.senac.projeto2.service.DiasSemAlocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dias-sem-alocacao")
public class DiasSemAlocacaoController {

    @Autowired
    private DiasSemAlocacaoService service;

    @GetMapping
    public ResponseEntity<List<DiasSemAlocacao>> listarTodos() {
        List<DiasSemAlocacao> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<DiasSemAlocacao> salvar(@RequestBody DiasSemAlocacao diasSemAlocacao) {
        DiasSemAlocacao novo = service.salvar(diasSemAlocacao);
        return ResponseEntity.ok(novo);
    }
}