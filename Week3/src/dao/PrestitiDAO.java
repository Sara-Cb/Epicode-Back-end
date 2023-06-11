package dao;

import javax.persistence.EntityManager;

import model.Prestito;
import utils.JpaUtil;

public class PrestitiDAO implements iPrestitiDAO {

    @Override
    public void effettuaPrestito(Prestito prestito) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(prestito);
            em.getTransaction().commit();
            System.out.println("Prestito effettuato con successo!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Errore durante l'effettuazione del prestito!");
        } finally {
            em.close();
        }
    }

    @Override
    public void restituisciPrestito(Prestito prestito) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(prestito);
            em.getTransaction().commit();
            System.out.println("Restituzione del prestito effettuata con successo!");
        } catch (Exception e) {
            em.getTransaction().rollback();
            System.out.println("Errore durante la restituzione del prestito!");
        } finally {
            em.close();
        }
    }
}
