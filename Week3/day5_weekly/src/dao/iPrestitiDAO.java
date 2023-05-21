package dao;

import model.Prestito;

public interface iPrestitiDAO {
	
    void effettuaPrestito(Prestito prestito);
    void restituisciPrestito(Prestito prestito);
    
}
