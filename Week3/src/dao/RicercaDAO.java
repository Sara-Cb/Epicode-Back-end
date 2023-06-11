package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Lettura;
import model.Prestito;
import utils.JpaUtil;

import java.time.LocalDate;
import java.util.List;

public class RicercaDAO implements iRicercaDAO {

    @Override
    public List<Lettura> cercaLetturaPerAnnoPubblicazione(int anno) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByAnnoPubblicazione", Lettura.class);
        query.setParameter("anno", anno);
        List<Lettura> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Lettura> cercaLetturaPerAutore(String autore) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByAutore", Lettura.class);
        query.setParameter("autore", autore);
        List<Lettura> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Lettura> cercaLetturaPerTitolo(String titolo) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByTitolo", Lettura.class);
        query.setParameter("titolo", "%" + titolo + "%");
        List<Lettura> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Prestito> cercaPrestitiInCorso() {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findInCorso", Prestito.class);
        List<Prestito> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Prestito> cercaPrestitiPerUtente(String nTessera) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findByUtente", Prestito.class);
        query.setParameter("nTessera", nTessera);
        List<Prestito> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Prestito> cercaPrestitiPerLettura(Lettura lettura) {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findByLettura", Prestito.class);
        query.setParameter("lettura", lettura);
        List<Prestito> result = query.getResultList();
        em.close();
        return result;
    }

    @Override
    public List<Prestito> cercaPrestitiScadutiNonRestituiti() {
        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findScadutiNonRestituiti", Prestito.class);
        query.setParameter("currentdate", LocalDate.now());
        List<Prestito> result = query.getResultList();
        em.close();
        return result;
    }
}