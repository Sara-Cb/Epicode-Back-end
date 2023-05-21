package dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Lettura;
import model.Prestito;
import utils.JpaUtil;

import java.time.LocalDate;
import java.util.List;

public class RicercaDAO implements iRicercaDAO {

    static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

    @Override
    public List<Lettura> cercaLetturaPerAnnoPubblicazione(int anno) {
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByAnnoPubblicazione", Lettura.class);
        query.setParameter("anno", anno);
        return query.getResultList();
    }

    @Override
    public List<Lettura> cercaLetturaPerAutore(String autore) {
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByAutore", Lettura.class);
        query.setParameter("autore", autore);
        return query.getResultList();
    }

    @Override
    public List<Lettura> cercaLetturaPerTitolo(String titolo) {
        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByTitolo", Lettura.class);
        query.setParameter("titolo", "%" + titolo + "%");
        return query.getResultList();
    }

    @Override
    public List<Prestito> cercaPrestitiInCorso() {
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findInCorso", Prestito.class);
        return query.getResultList();
    }

    @Override
    public List<Prestito> cercaPrestitiPerUtente(String nTessera) {
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findByUtente", Prestito.class);
        query.setParameter("nTessera", nTessera);
        return query.getResultList();
    }

    @Override
    public List<Prestito> cercaPrestitiPerLettura(Lettura lettura) {
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findByLettura", Prestito.class);
        query.setParameter("lettura", lettura);
        return query.getResultList();
    }

    @Override
    public List<Prestito> cercaPrestitiScadutiNonRestituiti() {
        TypedQuery<Prestito> query = em.createNamedQuery("Prestito.findScadutiNonRestituiti", Prestito.class);
        query.setParameter("currentdate", LocalDate.now());
        return query.getResultList();
    }
}
