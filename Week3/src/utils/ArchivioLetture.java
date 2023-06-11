package utils;

import java.util.List;
import java.util.ArrayList;

import model.Lettura;
import model.Libro;
import model.Rivista;

public class ArchivioLetture {
	public static List<Libro> archivioLibri;
	public static List<Rivista> archivioRiviste;
	public static List<Lettura> archivioLetture;
	
	
	static {
		
		archivioLibri = new ArrayList<Libro>();
        archivioRiviste = new ArrayList<Rivista>();
        archivioLetture = new ArrayList<Lettura>();
		
		archivioLibri.add(new Libro("1234", "Angeli e demoni", 2000, 500, "Dan Brown", "Thriller"));
		archivioLibri.add(new Libro("5678", "Il codice da Vinci", 2003, 600, "Dan Brown", "Thriller"));
		archivioLibri.add(new Libro("9012", "Inferno", 2013, 550, "Dan Brown", "Thriller"));
		archivioLibri.add(new Libro("3456", "Il simbolo perduto", 2009, 700, "Dan Brown", "Thriller"));
		archivioLibri.add(new Libro("7890", "Origin", 2017, 650, "Dan Brown", "Thriller"));
		archivioLibri.add(new Libro("2345", "Harry Potter e la pietra filosofale", 1997, 400, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("6789", "Harry Potter e la camera dei segreti", 1998, 450, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("0123", "Harry Potter e il prigioniero di Azkaban", 1999, 480, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("4567", "Harry Potter e il calice di fuoco", 2000, 520, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("8901", "Harry Potter e l'Ordine della Fenice", 2003, 550, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("5432", "Harry Potter e il principe mezzosangue", 2005, 600, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("9876", "Harry Potter e i doni della morte", 2007, 550, "J.K. Rowling", "Fantasy"));
		archivioLibri.add(new Libro("3210", "Il signore degli anelli: La compagnia dell'anello", 1954, 900, "J.R.R. Tolkien", "Fantasy"));
		archivioLibri.add(new Libro("7654", "Il signore degli anelli: Le due torri", 1954, 950, "J.R.R. Tolkien", "Fantasy"));
		archivioLibri.add(new Libro("1098", "Il signore degli anelli: Il ritorno del re", 1955, 1000, "J.R.R. Tolkien", "Fantasy"));
		archivioLibri.add(new Libro("6543", "1984", 1949, 350, "George Orwell", "Distopia"));
		archivioLibri.add(new Libro("0987", "Fahrenheit 451", 1953, 400, "Ray Bradbury", "Distopia"));
		archivioLibri.add(new Libro("4321", "Il GGG", 1982, 300, "Roald Dahl", "Fantasia"));
		archivioLibri.add(new Libro("8765", "Matilde", 1988, 320, "Roald Dahl", "Fantasia"));
		archivioLibri.add(new Libro("2109", "Il vecchio e il mare", 1952, 250, "Ernest Hemingway", "Romanzo"));
		
		archivioRiviste.add(new Rivista("M123", "National Geographic", 2021, 100, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M456", "Time", 2021, 80, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M789", "Vanity Fair", 2021, 60, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M111", "Science", 2022, 70, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M222", "Sports Illustrated", 2022, 50, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M333", "National Geographic Kids", 2022, 30, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M444", "The Economist", 2023, 90, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M555", "Vogue", 2023, 70, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M666", "Forbes", 2023, 50, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M777", "Time for Kids", 2023, 40, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M888", "Nature", 2024, 80, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M999", "People", 2024, 60, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M000", "Sports Illustrated Kids", 2024, 40, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M1111", "Wired", 2025, 90, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M2222", "National Geographic Traveler", 2025, 70, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M3333", "Fortune", 2025, 50, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M4444", "Scientific American", 2026, 80, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M5555", "GQ", 2026, 60, Frequenza.MENSILE));
		archivioRiviste.add(new Rivista("M6666", "Rolling Stone", 2026, 40, Frequenza.SETTIMANALE));
		archivioRiviste.add(new Rivista("M7777", "Travel + Leisure", 2026, 50, Frequenza.MENSILE));
		
		for (Libro libro : archivioLibri) {
	        archivioLetture.add(libro);
	    }
		
		for (Rivista rivista : archivioRiviste) {
	        archivioLetture.add(rivista);
	    }
}
}