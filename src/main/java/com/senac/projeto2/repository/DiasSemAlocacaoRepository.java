package com.senac.projeto2.repository;

import com.senac.projeto2.entity.DiasSemAlocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DiasSemAlocacaoRepository extends JpaRepository<DiasSemAlocacao, Integer> {
}