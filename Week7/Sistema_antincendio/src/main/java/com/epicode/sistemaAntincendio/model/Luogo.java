package com.epicode.sistemaAntincendio.model;

//Luogo.java
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "luoghi")
public class Luogo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String latitudine;
	private String longitudine;
	private String contatto;

	public Luogo(String latitudine, String longitudine, String contatto) {
		super();
		this.latitudine = latitudine;
		this.longitudine = longitudine;
		this.contatto = contatto;
	}

}
