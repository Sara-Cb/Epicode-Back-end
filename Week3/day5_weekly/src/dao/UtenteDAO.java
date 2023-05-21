package dao;

import javax.persistence.EntityManager;

import model.Utente;
import utils.JpaUtil;

public class UtenteDAO implements iUtenteDAO {
	
    static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
    
    @Override
    public Utente cercaUtentePerTessera(String nTessera) {
        return em.find(Utente.class, nTessera);
    }

	@Override
    public void aggiungiUtente(Utente utente) {
        em.persist(utente);
    }

    @Override
    public void rimuoviUtente(String nTessera) {
        Utente utente = cercaUtentePerTessera(nTessera);
        if (utente != null) {
            em.remove(utente);
        }
    }
}
