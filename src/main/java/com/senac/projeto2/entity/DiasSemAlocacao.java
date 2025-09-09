package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "dias_sem_alocacao")
public class DiasSemAlocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dias_sem_alocacao_id")
    private Integer id;

    @Column(name = "dias_sem_alocacao_data")
    private Date data;

    @Column(name = "dias_sem_alocacao_dia_semana")
    private Integer diaSemana;

    @Column(name = "dias_sem_alocacao_horario_inicio")
    private Date horarioInicio;

    @Column(name = "dias_sem_alocacao_horario_fim")
    private Date horarioFim;

    @Column(name = "ambiente_id")
    private Integer ambienteId;

    @Column(name = "dias_sem_alocacao_status")
    private Integer status;


}