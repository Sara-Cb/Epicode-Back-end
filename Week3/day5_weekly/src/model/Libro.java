package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Libro")
public class Libro extends Lettura {
    private String autore;
    private String genere;

    public Libro(String isbn, String titolo, int anno, int pag, String autore, String genere) {
        super(isbn, titolo, anno, pag);
        this.autore = autore;
        this.genere = genere;
    }

    public Libro() {
        super();
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
        return "Libro [ISBN=" + getISBN() + ", titolo=" + getTitolo() + ", anno=" + getAnno() + " autore=" + autore + ", genere=" + genere + ", pagine=" + getPagineN() + "]";
    }
}