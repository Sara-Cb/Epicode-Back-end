package model;

import utils.Frequenza;
import javax.persistence.*;

@Entity
@DiscriminatorValue("Rivista")
public class Rivista extends Lettura {
    @Enumerated(EnumType.STRING)
    private Frequenza periodicità;

    public Rivista(String isbn, String titolo, int anno, int pag, Frequenza periodo) {
        super(isbn, titolo, anno, pag);
        this.periodicità = periodo;
    }

    public Rivista() {
        super();
    }

    public Frequenza getPeriodo() {
        return periodicità;
    }

    public void setPeriodo(Frequenza periodo) {
        this.periodicità = periodo;
    }

    @Override
    public String toString() {
        return "Magazine [ISBN=" + getISBN() + ", titolo=" + getTitolo() + ", anno=" + getAnno() + ", pagineN=" + getPagineN() + ", periodo=" + periodicità + "]";
    }
}