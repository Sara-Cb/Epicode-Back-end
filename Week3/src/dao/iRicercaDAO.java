package dao;

import java.util.List;

import model.Lettura;
import model.Prestito;
import model.Utente;

public interface iRicercaDAO {
	
    List<Lettura> cercaLetturaPerAnnoPubblicazione(int anno);
    List<Lettura> cercaLetturaPerAutore(String autore);
    List<Lettura> cercaLetturaPerTitolo(String titolo);
	
	List<Prestito> cercaPrestitiInCorso();
    List<Prestito> cercaPrestitiPerUtente(String nTessera);
    List<Prestito> cercaPrestitiPerLettura(Lettura lettura);
    List<Prestito> cercaPrestitiScadutiNonRestituiti();
    
}
