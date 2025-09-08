package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Sala;
import com.senac.projeto2.service.SalaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/salas")
public class SalaController {

    @Autowired
    private SalaService salaService;

    @GetMapping
    public ResponseEntity<List<Sala>> listarTodos() {
        List<Sala> salas = salaService.listarTodos();
        return ResponseEntity.ok(salas);
    }

    @PostMapping
    public ResponseEntity<Sala> salvar(@RequestBody Sala sala) {
        Sala novaSala = salaService.salvar(sala);
        return ResponseEntity.ok(novaSala);
    }
}