package com.epicode.sensoriAntincendio.model;

import org.hibernate.annotations.ManyToAny;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sonda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Luogo luogo;
	@Enumerated(EnumType.STRING)
	private LivelloFumo livelloFumo = null;
	@ManyToOne
	private CentroDiControllo centroDiControllo;
	
	public Sonda(Luogo luogo, LivelloFumo livelloFumo, CentroDiControllo centroDiControllo) {
		super();
		this.luogo = luogo;
		this.livelloFumo = livelloFumo;
		this.centroDiControllo = centroDiControllo;
	}
	
	
}
