package com.epicode.sensoriAntincendio.model;

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
 private String nome;
 private String numero;
public Luogo(String latitudine, String longitudine, String nome, String numero) {
	super();
	this.latitudine = latitudine;
	this.longitudine = longitudine;
	this.nome = nome;
	this.numero = numero;
}
 
 
}
