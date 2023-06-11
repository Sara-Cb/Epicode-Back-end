package dao;

import javax.persistence.EntityManager;
import model.Utente;
import utils.JpaUtil;

public class UtenteDAO implements iUtenteDAO {

    @Override
    public void aggiungiUtente(Utente utente) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(utente);
            em.getTransaction().commit();
            System.out.println("Nuovo utente registrato in Biblioteca!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Errore su salvataggio!!");
        } finally {
            em.close();
        }
    }

    @Override
    public void rimuoviUtente(Utente utente) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
              em.getTransaction().begin();
              em.remove(utente);
              em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Errore su salvataggio!!");
        } finally {
            em.close();
        }
    }
}
