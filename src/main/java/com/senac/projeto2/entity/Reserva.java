package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "inicio")
    private Date inicio;

    @Column(name = "fim")
    private Date fim;

    @Column(name = "reservado_para")
    private String reservadoPara;

    @Column(name = "sala_id")
    private Integer salaId;

    @Column(name = "tempo")
    private Date tempo;

    // Getters e Setters
    // ...
}