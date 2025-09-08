package com.senac.projeto2.repository;

import com.senac.projeto2.entity.RegistroUtilizacaoAmbiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroUtilizacaoAmbienteRepository extends JpaRepository<RegistroUtilizacaoAmbiente, Integer> {
}