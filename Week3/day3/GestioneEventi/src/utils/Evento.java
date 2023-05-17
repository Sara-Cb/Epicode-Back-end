package utils;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="eventi")
public class Evento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_evento")
	private Integer id;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private LocalDate dataEvento;
	@Column
	private String descrizione;
	@Column(nullable = false)
	private tipoEvento tipoEvento;
	@Column(nullable = false)
	private int numeroMassimoPartecipanti;
	@Column(name = "lista_partecipazioni", nullable = false)
	@OneToOne(cascade = CascadeType.ALL)
	private Set<Partecipazione> listaPartecipazioni;
	@Column(nullable = false)
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Location location;
	
	
	public Evento() {
		super();
	}
	
	public Evento(String title, LocalDate dataEvento, String descrizione, utils.tipoEvento tipoEvento,
			int numeroMassimoPartecipanti) {
		super();
		this.title = title;
		this.dataEvento = dataEvento;
		this.descrizione = descrizione;
		this.tipoEvento = tipoEvento;
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(LocalDate dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public tipoEvento getTipoEvento() {
		return tipoEvento;
	}
	public void setTipoEvento(tipoEvento tipoEvento) {
		this.tipoEvento = tipoEvento;
	}
	public int getNumeroMassimoPartecipanti() {
		return numeroMassimoPartecipanti;
	}
	public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
		this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
	}
	public Set<Partecipazione> getListaPartecipazioni() {
		return listaPartecipazioni;
	}
	public void setListaPartecipazioni(Set<Partecipazione> listaPartecipazioni) {
		this.listaPartecipazioni = listaPartecipazioni;
	}
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Evento [id=" + id + ", title=" 
	+ title + ", dataEvento=" + dataEvento 
				+ ", descrizione=" + descrizione
				+ ", tipoEvento=" + tipoEvento 
				+ ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti
				+ ", listaPartecipazioni=" + listaPartecipazioni 
				+ ", location=" + location + "]";
	}
	
}
