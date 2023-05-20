package controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import utils.JpaUtil;



public class BibliotecaMain {
	
    static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
    static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {

        
        em.getTransaction().begin();
        em.getTransaction().commit();

        em.close();
        emf.close();
	}
}
