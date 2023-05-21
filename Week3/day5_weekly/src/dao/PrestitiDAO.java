package dao;

import javax.persistence.EntityManager;

import model.Prestito;
import utils.JpaUtil;

public class PrestitiDAO implements iPrestitiDAO {
	
    static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	@Override
    public void effettuaPrestito(Prestito prestito) {
        em.persist(prestito);
    }

    @Override
    public void restituisciPrestito(Prestito prestito) {
        em.merge(prestito);
    }
}
