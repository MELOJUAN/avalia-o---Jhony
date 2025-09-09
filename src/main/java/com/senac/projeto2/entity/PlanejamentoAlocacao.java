package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "planejamento_alocacao")
public class PlanejamentoAlocacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "planejamento_alocacao_id")
    private Integer id;

    @Column(name = "planejamento_alocacao_data")
    private Date data;

    @Column(name = "planejamento_alocacao_hora_inicio")
    private Date horaInicio;

    @Column(name = "planejamento_alocacao_hora_fim")
    private Date horaFim;

    @Column(name = "planejamento_alocacao_observacao")
    private String observacao;

    @Column(name = "planejamento_alocacao_status")
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "ambiente_id")
    private Ambiente ambiente;

    @OneToOne(mappedBy = "planejamentoAlocacao")
    private ReservaAlocacao reservaAlocacao;

}