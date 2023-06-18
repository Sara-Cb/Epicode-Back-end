package com.epicode.sensoriAntincendio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.epicode.sensoriAntincendio.model.CentroDiControllo;
import com.epicode.sensoriAntincendio.model.LivelloFumo;
import com.epicode.sensoriAntincendio.model.Luogo;
import com.epicode.sensoriAntincendio.model.Sonda;

@SpringBootApplication
public class SpringgestionePrenotazioni1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringgestionePrenotazioni1Application.class, args);
		
		Luogo luogo = new Luogo("30.1234", "32.0987", "Esposito", "3345555555");
		
		
		CentroDiControllo centroDiControllo = new CentroDiControllo();
		
		Sonda sonda = new Sonda(luogo, LivelloFumo.LIVELLO_TRE, centroDiControllo);
		centroDiControllo.stampaSegnale(sonda);

	}

	
}
