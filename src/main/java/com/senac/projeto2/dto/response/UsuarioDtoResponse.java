package com.senac.projeto2.dto.response;

public class UsuarioDtoResponse {
    private Integer id;
    private String nome;
    private String matricula;
    private Integer tipo;
    private Integer status;

    // Getters e Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Continue com os outros getters e setters
}