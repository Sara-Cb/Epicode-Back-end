package controller;

import javax.persistence.EntityManager;

import utils.JpaUtil;



public class BibliotecaMain {
	
    static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {
       
//        em.getTransaction().begin();
//        em.getTransaction().commit();
//
//        em.close();
		
		
		
	}
}
