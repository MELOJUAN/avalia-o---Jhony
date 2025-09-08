package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "registro_utilizacao_ambiente")
public class RegistroUtilizacaoAmbiente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "registro_utilizacao_ambiente_id")
    private Integer id;

    @Column(name = "registro_utilizacao_ambiente_hora_entrada")
    private Date horaEntrada;

    @Column(name = "registro_utilizacao_ambiente_hora_saida")
    private Date horaSaida;

    @Column(name = "registro_utilizacao_ambiente_status")
    private Integer status;

    @Column(name = "registro_utilizacao_ambiente_observacao")
    private String observacao;

    @Column(name = "usuario_id_retirada")
    private Integer usuarioIdRetirada;

    @Column(name = "usuario_id_devolucao")
    private Integer usuarioIdDevolucao;

    @Column(name = "ambiente_id")
    private Integer ambienteId;

    @Column(name = "planejamento_alocacao_id")
    private Integer planejamentoAlocacaoId;

    // Getters e Setters
    // ...
}