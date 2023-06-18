package com.epicode.sensoriAntincendio.model;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CentroDiControllo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "centroDiControllo", fetch = FetchType.EAGER)
	private List<Sonda> sonde = new ArrayList<Sonda>();
	
	public void stampaSegnale(Sonda s) {
		if(s.getLivelloFumo() == LivelloFumo.LIVELLO_TRE) {
			System.out.println("cazzo fra stai andando a fuoco come tua madre");
		}
	}
}
