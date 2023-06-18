package com.epicode.sistemaAntincendio.repository;

import org.springframework.data.jpa.repository.JpaRepository; 
import org.springframework.stereotype.Repository;

import com.epicode.sistemaAntincendio.model.CentroDiControllo;

@Repository
public interface CentroRepository extends JpaRepository <CentroDiControllo, Long> {

}
