package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Ambiente;
import com.senac.projeto2.service.AmbienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ambientes")
public class AmbienteController {

    @Autowired
    private AmbienteService ambienteService;

    @GetMapping
    public ResponseEntity<List<Ambiente>> listarTodos() {
        List<Ambiente> ambientes = ambienteService.listarTodos();
        return ResponseEntity.ok(ambientes);
    }

    @PostMapping
    public ResponseEntity<Ambiente> salvar(@RequestBody Ambiente ambiente) {
        Ambiente novoAmbiente = ambienteService.salvar(ambiente);
        return ResponseEntity.ok(novoAmbiente);
    }
}