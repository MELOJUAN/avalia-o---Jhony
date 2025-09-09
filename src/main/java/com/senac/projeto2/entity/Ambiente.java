package com.senac.projeto2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ambiente")
public class Ambiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ambiente_id")
    private Integer id;

    @Column(name = "ambiente_descricao")
    private String descricao;

    @Column(name = "ambiente_andar")
    private String andar;

    @Column(name = "ambiente_tipo")
    private String tipo;

    @Column(name = "ambiente_numero_pos")
    private Integer numeroPos;

    @Column(name = "ambiente_capacidade")
    private Integer capacidade;

    @Column(name = "ambiente_status")
    private Integer status;


}