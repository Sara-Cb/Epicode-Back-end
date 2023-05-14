package biblioteca;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Magazine extends Lettura {
	
	private static final Logger log = LoggerFactory.getLogger(Magazine.class);
	
	private Frequenza periodo;
	
	public enum Frequenza {
		SETTIMANALE, 
		MENSILE, 
		ANNUALE;
	}

	public Magazine(String isbn, String titolo, int anno, int pag, Frequenza periodo) {
		super(isbn, titolo, anno, pag);
		this.periodo = periodo;
	}

	public Frequenza getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Frequenza periodo) {
		this.periodo = periodo;
	}

	@Override
	public String toString() {
	    return "Magazine," + getTitolo() + "," + getAnno() + "," + getPagineN() + "," + periodo + "," + getISBN();
	}

	public static Magazine fromString(String str) {
	    String[] div = str.split(",");
	    if (div.length != 6) {
	        return null;
	    }

	    try {
	        String titolo = div[1];
	        int anno = Integer.parseInt(div[2]);
	        int pag = Integer.parseInt(div[3]);
	        Frequenza periodo = Frequenza.valueOf(div[4]);
	        String isbn = div[5];
	        
	        return new Magazine(isbn, titolo, anno, pag, periodo);
	    } catch (NumberFormatException e) {
	        log.error("NumberFormatException in Magazine.fromString: ", e.getMessage());
	        return null;
	    }
	}
}
