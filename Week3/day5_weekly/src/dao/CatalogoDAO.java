package dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;

import model.Lettura;
import utils.JpaUtil;

public class CatalogoDAO implements iCatalogoDAO {

    static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();


    @Override
    public Lettura cercaLetturaPerISBN(String isbn) {
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByISBN", Lettura.class);
        query.setParameter("isbn", isbn);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
    @Override
    public void aggiungiLettura(Lettura lettura) {
        em.persist(lettura);
    }

    @Override
    public void rimuoviLettura(String isbn) {
        Lettura lettura = cercaLetturaPerISBN(isbn);
        if (lettura != null) {
            em.remove(lettura);
        }
    }
}
