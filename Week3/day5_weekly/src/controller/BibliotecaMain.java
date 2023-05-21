package controller;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;

import utils.JpaUtil;
import utils.RegistroPrestiti;
import utils.ArchivioLetture;
import utils.ElencoUtenti;
import dao.*;
import model.Lettura;
import model.Libro;
import model.Prestito;
import model.Rivista;
import model.Utente;


public class BibliotecaMain {
	
	// static EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();

	public static void main(String[] args) {
       
//      em.getTransaction().begin();
//      em.getTransaction().commit();
//      em.close();
	
		CatalogoDAO catalogoDAO = new CatalogoDAO();
        PrestitiDAO prestitoDAO = new PrestitiDAO();
        UtenteDAO utenteDAO = new UtenteDAO();
        RicercaDAO ricercaDAO = new RicercaDAO();
		
//        List<Lettura> archivioLetture = ArchivioLetture.archivioLetture;
//        for (Lettura lettura : archivioLetture) {
//            catalogoDAO.aggiungiLettura(lettura);
//        }
//        
//        List<Utente> elencoUtenti = ElencoUtenti.elencoUtenti;
//        for (Utente utente : elencoUtenti) {
//        	utenteDAO.aggiungiUtente(utente);
//        }
//
//        List<Prestito> registroPrestiti = RegistroPrestiti.registroPrestiti;
//        for (Prestito prestito : registroPrestiti) {
//            prestitoDAO.effettuaPrestito(prestito);
//        }
        
        String isbn = "1234";
        Lettura letturaISBN = catalogoDAO.cercaLetturaPerISBN(isbn);
        // catalogoDAO.rimuoviLettura(letturaISBN);
        int annoPubblicazione = 2000;
        List<Lettura> lettureAnno = ricercaDAO.cercaLetturaPerAnnoPubblicazione(annoPubblicazione);
        
	}
}
