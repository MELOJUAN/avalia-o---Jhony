package com.senac.projeto2.controller;

import com.senac.projeto2.dto.request.UsuarioDtoRequest;
import com.senac.projeto2.dto.response.UsuarioDtoResponse;
import com.senac.projeto2.entity.Usuario;
import com.senac.projeto2.service.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<UsuarioDtoResponse>> listarTodos() {
        List<Usuario> usuarios = usuarioService.listarTodos();
        List<UsuarioDtoResponse> response = usuarios.stream()
                .map(usuario -> modelMapper.map(usuario, UsuarioDtoResponse.class))
                .collect(Collectors.toList());
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<UsuarioDtoResponse> salvar(@RequestBody UsuarioDtoRequest request) {
        Usuario usuario = modelMapper.map(request, Usuario.class);
        Usuario novoUsuario = usuarioService.salvar(usuario);
        UsuarioDtoResponse response = modelMapper.map(novoUsuario, UsuarioDtoResponse.class);
        return ResponseEntity.ok(response);
    }
}