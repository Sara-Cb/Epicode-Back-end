package com.epicode.sistemaAntincendio.repository;

//LuogoRepository.java
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epicode.sistemaAntincendio.model.Luogo;

@Repository
public interface LuogoRepository extends JpaRepository<Luogo, Long> {
}
