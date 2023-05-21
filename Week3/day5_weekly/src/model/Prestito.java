package model;

import java.time.LocalDate; 

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "prestiti")
@NamedQueries({
    @NamedQuery(name = "Prestito.findByUtente", query = "SELECT p FROM Prestito p WHERE p.utente.nTessera = :nTessera"),
    @NamedQuery(name = "Prestito.findByLettura", query = "SELECT p FROM Prestito p WHERE p.lettura = :lettura"),
    @NamedQuery(name = "Prestito.findInCorso", query = "SELECT p FROM Prestito p WHERE p.dataRestituzioneEffettiva IS NULL"),
    @NamedQuery(name = "Prestito.findScadutiNonRestituiti", query = "SELECT p FROM Prestito p WHERE p.dataRestituzionePrevista < :currentdate AND p.dataRestituzioneEffettiva IS NULL")
})
public class Prestito {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "lettura", nullable = false)
    private Lettura lettura;

    @ManyToOne
    @JoinColumn(name = "utente", nullable = false)
    private Utente utente;

    @Column(name = "data_inizio_prestito", nullable = false)
    private LocalDate dataInizioPrestito;

    @Column(name = "data_restituzione_prevista", nullable = false)
    private LocalDate dataRestituzionePrevista;

    @Column(name = "data_restituzione_effettiva")
    private LocalDate dataRestituzioneEffettiva;

	public Prestito(Long id, Lettura lettura, Utente utente, LocalDate dataInizioPrestito,
			LocalDate dataRestituzioneEffettiva) {
		super();
		this.id = id;
		this.lettura = lettura;
		this.utente = utente;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}

	public Prestito(Long id, Lettura lettura, Utente utente, LocalDate dataInizioPrestito) {
		super();
		this.id = id;
		this.lettura = lettura;
		this.utente = utente;
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
	}

	public Prestito() {
		super();
	}

	public Lettura getLettura() {
		return lettura;
	}

	public void setLettura(Lettura lettura) {
		this.lettura = lettura;
	}

	public Utente getUtente() {
		return utente;
	}

	public void setUtente(Utente utente) {
		this.utente = utente;
	}

	public LocalDate getDataInizioPrestito() {
		return dataInizioPrestito;
	}

	public void setDataInizioPrestito(LocalDate dataInizioPrestito) {
		this.dataInizioPrestito = dataInizioPrestito;
		this.dataRestituzionePrevista = dataInizioPrestito.plusDays(30);
	}
	
	public LocalDate getDataRestituzionePrevista() {
		return dataRestituzionePrevista;
	}

	public LocalDate getDataRestituzioneEffettiva() {
		return dataRestituzioneEffettiva;
	}

	public void setDataRestituzioneEffettiva(LocalDate dataRestituzioneEffettiva) {
		this.dataRestituzioneEffettiva = dataRestituzioneEffettiva;
	}
	
	
    

}
