package com.senac.projeto2.controller;

import com.senac.projeto2.entity.RegistroUtilizacaoAmbiente;
import com.senac.projeto2.service.RegistroUtilizacaoAmbienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registro-utilizacao")
public class RegistroUtilizacaoAmbienteController {

    @Autowired
    private RegistroUtilizacaoAmbienteService service;

    @GetMapping
    public ResponseEntity<List<RegistroUtilizacaoAmbiente>> listarTodos() {
        List<RegistroUtilizacaoAmbiente> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<RegistroUtilizacaoAmbiente> salvar(@RequestBody RegistroUtilizacaoAmbiente registro) {
        RegistroUtilizacaoAmbiente novo = service.salvar(registro);
        return ResponseEntity.ok(novo);
    }
}