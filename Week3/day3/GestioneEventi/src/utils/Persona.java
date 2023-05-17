package utils;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="persone")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pers")
	private Integer id;
	@Column(nullable = false)
	private String nome;
	private String cognome;
	private String email;
	private LocalDate dNascita;
	private Sesso sesso;
	private List<Partecipazione> listaPartecipazioni;
	public String getNome() {
		return nome;
	}
	
	public Persona() {
		super();
	}
	
	public Persona(String nome, String cognome, String email, LocalDate dNascita, Sesso sesso,
			List<Partecipazione> listaPartecipazioni) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.dNascita = dNascita;
		this.sesso = sesso;
		this.listaPartecipazioni = listaPartecipazioni;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getdNascita() {
		return dNascita;
	}
	public void setdNascita(LocalDate dNascita) {
		this.dNascita = dNascita;
	}
	public Sesso getSesso() {
		return sesso;
	}
	public void setSesso(Sesso sesso) {
		this.sesso = sesso;
	}
	public List<Partecipazione> getListaPartecipazioni() {
		return listaPartecipazioni;
	}
	public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
		this.listaPartecipazioni = listaPartecipazioni;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nome=" + nome + ", Cognome=" + cognome + ", email=" + email + ", dNascita="
				+ dNascita + ", sesso=" + sesso + ", listaPartecipazioni=" + listaPartecipazioni + "]";
	}

}
