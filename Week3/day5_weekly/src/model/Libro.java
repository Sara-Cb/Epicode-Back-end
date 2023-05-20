package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "libri")
public class Libro extends Lettura {
    @Column(name = "autore")
    private String autore;

    @Column(name = "genere")
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