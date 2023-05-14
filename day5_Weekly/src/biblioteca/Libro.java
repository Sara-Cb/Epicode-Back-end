package biblioteca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Libro extends Lettura {
	
	private static final Logger log = LoggerFactory.getLogger(Libro.class);
	
	private String autore;
	private String genere;

	public Libro(String isbn, String titolo, int anno, int pag, String autore, String genere) {
		super(isbn, titolo, anno, pag);
		this.autore = autore;
		this.genere = genere;
		
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) {
		this.autore = autore;
	}

	public String getGenere() {
		return genere;
	}

	public void setGenere(String genere) {
		this.genere = genere;
	}

	@Override
	public String toString() {
	    return "Libro," + getTitolo() + "," + getAnno() + "," + autore + "," + genere + "," + getPagineN() + "," + getISBN();
	}

	public static Libro compiledBook(String str) {
	    String[] div = str.split(",");
	    if (div.length != 7) {
	        return null;
	    }
	    
	    try {
	        String titolo = div[1];
	        int anno = Integer.parseInt(div[2]);
	        String autore = div[3];
	        String genere = div[4];
	        int pagineN = Integer.parseInt(div[5]);
	        String isbn = div[6];
	        
	        return new Libro(isbn, titolo, anno, pagineN, autore, genere);
	    } catch (NumberFormatException e) {
	        log.error("NumberFormatException in Book.fromString: ", e.getMessage());
	        return null;
	    }
	}
}
