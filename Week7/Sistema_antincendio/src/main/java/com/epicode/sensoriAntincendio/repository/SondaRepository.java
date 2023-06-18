package com.epicode.sensoriAntincendio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.sensoriAntincendio.model.Sonda;

@Repository
public interface SondaRepository extends JpaRepository <Sonda, Long> {

}
