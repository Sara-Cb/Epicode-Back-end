package biblioteca;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import biblioteca.Magazine.Frequenza;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Catalogo {
	
	private List<Lettura> items;
	
	private static final Logger logger = LoggerFactory.getLogger(Catalogo.class);
	
	private static String path = "data/catalogo.txt";
	private static File file = new File(path);
	
	public Catalogo() {
		items = Collections.synchronizedList(new ArrayList<>());
	}
	
	public boolean aggiungiLettura(Lettura lett) {
		
		if (cercaISBN(lett.getISBN()).isPresent()) {
			logger.error("Una lettura con questo ISBN è già presente", lett.getISBN());
			return false;
		}
        items.add(lett);
        System.out.println("Lettura con codice: " + lett.getISBN() + " - Aggiunta correttamente"); 
		return true;
    }
	
	public boolean rimuoviLettura(String isbn) {
		boolean removed = items.removeIf(item -> item.getISBN().equals(isbn));
		if (!removed) {
			logger.error("Non trovata lettura con questo ISBN: ", isbn);
		}
		return removed;
    }

	public List<Libro> cercaAutore(String aut) {
	    String autore = aut.toLowerCase();
	    return items.stream()
	            .filter(item -> item instanceof Libro && ((Libro) item).getAutore().toLowerCase().equals(autore))
	            .map(item -> (Libro) item)
	            .collect(Collectors.toList());
	}
	
	public Optional<Lettura> cercaISBN(String isbn) {
		System.out.println("Cerco la lettura con codice: " + isbn); 
	    return items.stream()
	        .filter(item -> item.getISBN().equals(isbn))
	        .findAny();
	}
	
	public List<Lettura> cercaAnno(int anno) {
	    return items.stream()
	        .filter(item -> item.getAnno() == anno)
	        .collect(Collectors.toList());
	}

	
	public void scriviDisk() throws IOException {
		String data = items.stream()
				.map(Lettura::toString)
				.collect(Collectors.joining("\n"));
		
		try {
			FileUtils.writeStringToFile(file, data, "UTF-8");
		} catch (IOException e) {
			logger.error("Errore nella scrittura su file", e.getMessage());
			throw e;
		}
	}
	
	public void leggiDisk() throws IOException {
	    try {
	        List<String> lines = FileUtils.readLines(file, "UTF-8");
	        
	        for (String line : lines) {
	            String[] fields = line.split(",");
	            Lettura newItem = null;
	            
	            if (fields.length == 7) {
	                String type = fields[0];
	                String titolo = fields[1];
	                int anno = Integer.parseInt(fields[2]);
	                String autore = fields[3];
	                String genere = fields[4];
	                int pag = Integer.parseInt(fields[5]);
	                String isbn = fields[6];
	                
	                System.out.println(type.toUpperCase() + " - " + titolo + " (" + anno + "), " + autore + ", Genere: " + genere + ", n° pag. " + pag + ", ISBN: " + isbn);
	                newItem = new Libro(isbn, titolo, anno, pag, autore, genere);
	                
	            } else if (fields.length == 6) {
	                String type = fields[0];
	                String titolo = fields[1];
	                int anno = Integer.parseInt(fields[2]);
	                int pag = Integer.parseInt(fields[3]);
	                String periodo = fields[4].toUpperCase();
	                String isbn = fields[5];
	                
	                System.out.println(type.toUpperCase() + " - " + titolo + " (" + anno + "), n° pag. " + pag + ", Frequenza: " + periodo + ", ISBN: " + isbn);
	                newItem = new Magazine(isbn, titolo, anno, pag, Frequenza.valueOf(periodo));
	            }
	            aggiungiLettura(newItem);
	        }
	        
	    } catch (IOException e) {
	        logger.error("Errore di caricamento da file", e.getMessage());
	        throw e;
	    }
	}
}