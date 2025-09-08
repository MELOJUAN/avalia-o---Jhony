package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reserva_alocacao")
public class ReservaAlocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reserva_alocacao_id")
    private Integer id;

    @Column(name = "reserva_alocacao_justificativa")
    private String justificativa;

    @Column(name = "reserva_alocacao_data")
    private Date data;

    @Column(name = "reserva_alocacao_hora_inicio")
    private Date horaInicio;

    @Column(name = "reserva_alocacao_hora_fim")
    private Date horaFim;

    @Column(name = "reserva_alocacao_status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "reserva_id")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "planejamento_alocacao_id")
    private PlanejamentoAlocacao planejamentoAlocacao;

    // Getters e Setters
    // ...
}