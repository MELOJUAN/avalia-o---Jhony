package com.senac.projeto2.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuario_id")
    private Integer id;

    @Column(name = "usuario_nome")
    private String nome;

    @Column(name = "usuario_matricula")
    private String matricula;

    @Column(name = "usuario_tipo")
    private Integer tipo;

    @Column(name = "usuario_status")
    private Integer status;

    @Column(name = "usuario_log_data_criacao")
    private Date dataCriacao;

    @Column(name = "usuario_log_responsavel_id")
    private Integer responsavelId;

    @OneToMany(mappedBy = "usuario")
    private List<ReservaAlocacao> reservaAlocacoes;

    @OneToMany(mappedBy = "usuario")
    private List<PlanejamentoAlocacao> planejamentoAlocacoes;

    // Getters e Setters
    // (Adicione aqui todos os getters e setters para os atributos acima)
}