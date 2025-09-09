package com.senac.projeto2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "bloco")
    private String bloco;

    @Column(name = "capacidade")
    private Integer capacidade;

    @Column(name = "nome")
    private String nome;


}