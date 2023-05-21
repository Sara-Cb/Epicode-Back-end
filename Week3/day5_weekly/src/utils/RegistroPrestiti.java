package utils;

import model.*;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;


public class RegistroPrestiti {
	public static List<Prestito> registroPrestiti;
	
	static {
		
		registroPrestiti = new ArrayList<Prestito>();

		List<Utente> listaUtenti = ElencoUtenti.elencoUtenti;
		List<Lettura> listaLetture = ArchivioLetture.archivioLetture;
		
		Utente utente1 = listaUtenti.get(0);
        Utente utente2 = listaUtenti.get(1);
        Utente utente3 = listaUtenti.get(2);
        Utente utente4 = listaUtenti.get(3);
        Utente utente5 = listaUtenti.get(4);
        Utente utente6 = listaUtenti.get(5);
        Utente utente7 = listaUtenti.get(6);
        Utente utente8 = listaUtenti.get(7);
        Utente utente9 = listaUtenti.get(8);
        Utente utente10 = listaUtenti.get(9);
        
        Lettura lettura1 = listaLetture.get(0);
        Lettura lettura2 = listaLetture.get(4);
        Lettura lettura3 = listaLetture.get(6);
        Lettura lettura4 = listaLetture.get(8);
        Lettura lettura5 = listaLetture.get(10);
        Lettura lettura6 = listaLetture.get(20);
        Lettura lettura7 = listaLetture.get(25);
        Lettura lettura8 = listaLetture.get(28);
        Lettura lettura9 = listaLetture.get(30);
        Lettura lettura10 = listaLetture.get(34);
		
        registroPrestiti.add(new Prestito(lettura1, utente1, LocalDate.of(2023, 5, 21)));
        registroPrestiti.add(new Prestito(lettura2, utente2, LocalDate.of(2023, 5, 21)));
        registroPrestiti.add(new Prestito(lettura3, utente3, LocalDate.of(2023, 5, 21)));
        registroPrestiti.add(new Prestito(lettura4, utente4, LocalDate.of(2023, 5, 21)));
        registroPrestiti.add(new Prestito(lettura5, utente5, LocalDate.of(2023, 5, 21)));
        registroPrestiti.add(new Prestito(lettura6, utente6, LocalDate.of(2023, 5, 1), LocalDate.of(2023, 6, 30)));
        registroPrestiti.add(new Prestito(lettura7, utente7, LocalDate.of(2023, 5, 2), LocalDate.of(2023, 6, 1)));
        registroPrestiti.add(new Prestito(lettura8, utente8, LocalDate.of(2023, 5, 3), LocalDate.of(2023, 6, 2)));
        registroPrestiti.add(new Prestito(lettura9, utente9, LocalDate.of(2023, 5, 4), LocalDate.of(2023, 6, 3)));
        registroPrestiti.add(new Prestito(lettura10, utente10, LocalDate.of(2023, 5, 5), LocalDate.of(2023, 6, 4)));
	}
	

}
