package com.senac.projeto2.repository;

import com.senac.projeto2.entity.PlanejamentoAlocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanejamentoAlocacaoRepository extends JpaRepository<PlanejamentoAlocacao, Integer> {
}