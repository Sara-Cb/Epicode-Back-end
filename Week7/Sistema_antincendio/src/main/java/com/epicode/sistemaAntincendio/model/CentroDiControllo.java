package com.epicode.sistemaAntincendio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "centri_controllo")
public class CentroDiControllo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public void stampaSegnale(Sonda s) {
		switch (s.getFumo()) {
		case LIVELLO_UNO, LIVELLO_DUE: {
			System.out.println("Livello fumo lieve, controllare sonda: " + s.getId());
		}
		case LIVELLO_TRE, LIVELLO_QUATTRO: {
			System.out.println("Livello fumo allarmante, probabile incendio");
		}
		case LIVELLO_CINQUE, LIVELLO_SEI: {
			System.out.println("Incendio in corso, evaquare");
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + s.getFumo());
		}

	}
}
