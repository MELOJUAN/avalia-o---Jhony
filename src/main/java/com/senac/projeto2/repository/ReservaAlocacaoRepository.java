package com.senac.projeto2.repository;

import com.senac.projeto2.entity.ReservaAlocacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaAlocacaoRepository extends JpaRepository<ReservaAlocacao, Integer> {
}