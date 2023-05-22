package dao;

import model.Lettura;

public interface iCatalogoDAO {
	
    Lettura cercaLetturaPerISBN(String isbn);
    void aggiungiLettura(Lettura lettura);
    void rimuoviLettura(String isbn);
    
}