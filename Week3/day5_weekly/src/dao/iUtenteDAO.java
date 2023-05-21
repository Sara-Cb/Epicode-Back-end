package dao;

import model.Utente;

public interface iUtenteDAO {
	
    Utente cercaUtentePerTessera(String nTessera);
    void aggiungiUtente(Utente utente);
    void rimuoviUtente(String nTessera);
    
}
