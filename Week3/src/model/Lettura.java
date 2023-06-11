package model;

import java.util.List;  
import java.util.ArrayList;  

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="catalogo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_lettura")
@NamedQueries({
	@NamedQuery(name = "Lettura.removeFromCatalog", query = "DELETE FROM Lettura l WHERE l.ISBN = :isbn"),
	@NamedQuery(name = "Lettura.findByISBN", query = "SELECT l FROM Lettura l WHERE l.ISBN = :isbn"),
	@NamedQuery(name = "Lettura.findByAnnoPubblicazione", query = "SELECT l FROM Lettura l WHERE l.anno = :anno"),
	@NamedQuery(name = "Lettura.findByTitolo", query = "SELECT l FROM Lettura l WHERE l.titolo LIKE :titolo"),
	@NamedQuery(name = "Lettura.findByAutore", query = "SELECT l FROM Libro l WHERE l.autore = :autore")
})
public abstract class Lettura {
    @Id
    @Column(name = "codice_ISBN")
    private String ISBN;

    @Column(name = "titolo", nullable = false)
    private String titolo;

    @Column(name = "anno_pubblicazione", nullable = false)
    private int anno;

    @Column(name = "numero_pagine", nullable = false)
    private int pagineN;
    
    @OneToMany(mappedBy = "lettura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prestito> prestiti = new ArrayList<Prestito>(0);


    public Lettura(String isbn, String titolo, int anno, int numPag) {
        this.ISBN = isbn;
        this.titolo = titolo;
        this.anno = anno;
        this.pagineN = numPag;
    }

    public Lettura() {
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String codISBN) {
        this.ISBN = codISBN;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public int getPagineN() {
        return pagineN;
    }

    public void setPagineN(int pagineN) {
        this.pagineN = pagineN;
    }

    @Override
    public String toString() {
        return "Lettura [codISBN=" + ISBN + ", titolo=" + titolo + ", anno=" + anno + ", pagineN=" + pagineN + "]";
    }
}