package com.epicode.sistemaAntincendio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.sistemaAntincendio.model.Sonda;

@Repository
public interface SondaRepository extends JpaRepository <Sonda, Long> {

}
