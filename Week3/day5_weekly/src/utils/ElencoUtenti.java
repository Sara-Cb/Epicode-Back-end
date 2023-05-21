package utils;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

import model.Utente;

public class ElencoUtenti {
	public static List<Utente> elencoUtenti;
	
	static {
		
		elencoUtenti = new ArrayList<Utente>();
        
		elencoUtenti.add(new Utente("Mario", "Rossi", LocalDate.of(1990, 5, 10)));
		elencoUtenti.add(new Utente("Laura", "Bianchi", LocalDate.of(1985, 9, 20)));
		elencoUtenti.add(new Utente("Giuseppe", "Verdi", LocalDate.of(1995, 2, 15)));
		elencoUtenti.add(new Utente("Anna", "Esposito", LocalDate.of(1992, 7, 8)));
		elencoUtenti.add(new Utente("Luca", "Ricci", LocalDate.of(1988, 12, 3)));
		elencoUtenti.add(new Utente("Giulia", "Galli", LocalDate.of(1993, 4, 18)));
		elencoUtenti.add(new Utente("Paolo", "Conti", LocalDate.of(1998, 1, 25)));
		elencoUtenti.add(new Utente("Francesca", "Rizzo", LocalDate.of(1987, 6, 14)));
		elencoUtenti.add(new Utente("Alessandro", "De Luca", LocalDate.of(1991, 9, 9)));
		elencoUtenti.add(new Utente("Martina", "Ferrari", LocalDate.of(1994, 3, 27)));
		elencoUtenti.add(new Utente("Marco", "Greco", LocalDate.of(1989, 11, 21)));
		elencoUtenti.add(new Utente("Chiara", "Marino", LocalDate.of(1997, 8, 6)));
		elencoUtenti.add(new Utente("Davide", "Santoro", LocalDate.of(1996, 10, 12)));
		elencoUtenti.add(new Utente("Sara", "Cattaneo", LocalDate.of(1986, 7, 29)));
		elencoUtenti.add(new Utente("Fabio", "Moretti", LocalDate.of(1999, 2, 2)));
		elencoUtenti.add(new Utente("Elisa", "Barbieri", LocalDate.of(1992, 4, 5)));
		elencoUtenti.add(new Utente("Simone", "Gallo", LocalDate.of(1993, 11, 9)));
		elencoUtenti.add(new Utente("Giovanna", "Marchetti", LocalDate.of(1988, 1, 17)));
		elencoUtenti.add(new Utente("Roberto", "Lombardi", LocalDate.of(1995, 6, 23)));
		elencoUtenti.add(new Utente("Elena", "Pellegrini", LocalDate.of(1990, 3, 30)));
	}
}
