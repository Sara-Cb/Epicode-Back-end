package model;

import utils.Frequenza;
import javax.persistence.*;

@Entity
@Table(name = "riviste")
public class Rivista extends Lettura {
    @Enumerated(EnumType.STRING)
    @Column(name = "periodo")
    private Frequenza periodo;

    public Rivista(String isbn, String titolo, int anno, int pag, Frequenza periodo) {
        super(isbn, titolo, anno, pag);
        this.periodo = periodo;
    }

    public Rivista() {
        super();
    }

    public Frequenza getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Frequenza periodo) {
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Magazine [ISBN=" + getISBN() + ", titolo=" + getTitolo() + ", anno=" + getAnno() + ", pagineN=" + getPagineN() + ", periodo=" + periodo + "]";
    }
}