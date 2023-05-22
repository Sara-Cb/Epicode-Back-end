package dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import model.Lettura;
import utils.JpaUtil;

public class CatalogoDAO implements iCatalogoDAO {
	
	    @Override
	    public void aggiungiLettura(Lettura lettura) {
	        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	        try {
	            em.getTransaction().begin();
	            em.persist(lettura);
	            em.getTransaction().commit();
	            System.out.println("Hai aggiunto una lettura all'Archivio!");
	        } catch (Exception e) {
	            em.getTransaction().rollback();
	            System.out.println("Errore su salvataggio!!");
	        } finally {
	            em.close();
	        }
	    }

	    @Override
	    public void rimuoviLettura(String isbn) {
	        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	        try {
	            Lettura lettura = cercaLetturaPerISBN(isbn);
	            if (lettura != null) {
	            	Query query = em.createQuery("SELECT COUNT(p) FROM Prestito p WHERE p.libro.ISBN = :isbn AND p.dataRestituzione IS NULL");
	                query.setParameter("isbn", isbn);
	                Long count = (Long) query.getSingleResult();
	                
	                if (count > 0) {
	                    System.out.println("Non puoi eliminare questo libro perché è in prestito!");
	                } else {
	                em.getTransaction().begin();
	                Query q = em.createNamedQuery("Lettura.removeFromCatalog");
	                q.setParameter("isbn", isbn);
	                q.executeUpdate();
	                em.getTransaction().commit();
	                System.out.println("Hai rimosso una lettura dall'Archivio!");
	            }} else {
	                System.out.println("Codice ISBN non presente!");
	            }
	        } catch (Exception e) {
	            em.getTransaction().rollback();
	            System.out.println("Errore su rimozione!!");
	        } finally {
	            em.close();
	        }
	    }
	    
	    
	    
	    @Override
	    public Lettura cercaLetturaPerISBN(String isbn) {
	        EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
	        TypedQuery<Lettura> query = em.createNamedQuery("Lettura.findByISBN", Lettura.class);
	        query.setParameter("isbn", isbn);
	        try {
	        	Lettura result = query.getSingleResult();
	            System.out.println(result.toString());
	            return result;
	        } catch (NoResultException e) {
                System.out.println("Codice ISBN non presente!");
	            return null;
	        } finally {
	            em.close();
	    }
	}    
}

