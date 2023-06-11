package dao;

import model.Utente;

public interface iUtenteDAO {
	
    void aggiungiUtente(Utente utente);
    void rimuoviUtente(Utente utente);
    
}
