package com.senac.projeto2.repository;

import com.senac.projeto2.entity.Ambiente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmbienteRepository extends JpaRepository<Ambiente, Integer> {
}