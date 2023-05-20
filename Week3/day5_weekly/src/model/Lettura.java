package model;

import java.util.List; 

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "letture")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Lettura {
    @Id
    @Column(name = "ISBN")
    private String ISBN;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "anno")
    private int anno;

    @Column(name = "pagineN")
    private int pagineN;
    
    @OneToMany(mappedBy = "lettura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Prestito> prestiti;


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