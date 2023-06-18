package com.epicode.sistemaAntincendio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "sonde")
public class Sonda {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(nullable = false)
	private Luogo luogo;
	@ManyToOne
	@JoinColumn(nullable = false, name = "centro_controllo")
	private CentroDiControllo centroDiControllo;
	@Enumerated(EnumType.STRING)
	private LivelloFumo fumo;

	public Sonda(Luogo luogo, CentroDiControllo centroDiControllo) {
		super();
		this.luogo = luogo;
		this.fumo = LivelloFumo.LIVELLO_ZERO;
		this.centroDiControllo = centroDiControllo;
	}

}
