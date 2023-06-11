package biblioteca;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.io.IOException;

public class BibliotecaMain {
		private static Catalogo catalogo;
	    private static Scanner scan;
	    
	    public static void main(String[] args) {
	        catalogo = new Catalogo();
	        boolean continua = true;

	        System.out.println("Benvenuto in biblioteca! Scegli un'azione:");
	        scan = new Scanner(System.in);
	        while (continua) {
	            stampaMenu();
	            int scelta = leggiScelta();
	            eseguiScelta(scelta);
	            System.out.println();
	        }
	        scan.close();

	    }

	    private static void stampaMenu() {
	        System.out.println("1. Aggiungi una lettura al catalogo");
	        System.out.println("2. Rimuovi una lettura dal catalogo");
	        System.out.println("3. Cerca una lettura per ISBN");
	        System.out.println("4. Cerca una lettura per anno di pubblicazione");
	        System.out.println("5. Cerca per autore");
	        System.out.println("6. Salva il catalogo su file");
	        System.out.println("7. Leggi il contenuto del file");
	        System.out.println("0. Premi per uscire");
	    }

	    private static int leggiScelta() {
	        int scelta = -1;
	        boolean sceltaValida = false;
	        
	        while (!sceltaValida) {
	            try {
	                scelta = Integer.parseInt(scan.nextLine());
	                if (scelta >= 0 && scelta <= 7) {
	                    sceltaValida = true;
	                } else {
	                    System.out.println("Scelta non valida. Riprova:");
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Scelta non valida. Riprova:");
	            }
	        }
	        
	        return scelta;
	    }

	    private static void eseguiScelta(int scelta) {
	        switch(scelta) {
	            case 0:
	                System.out.println("Arrivederci!");
	                System.exit(0);
	                break;
	            case 1:
	                aggiungiLettura();
	                break;
	            case 2:
	                rimuoviLettura();
	                break;
	            case 3:
	                cercaPerISBN();
	                break;
	            case 4:
	                cercaPerAnnoPubblicazione();
	                break;
	            case 5:
	                cercaPerAutore();
	                break;
	            case 6:
	                salvaCatalogoSuFile();
	                break;
	            case 7:
	                leggiCatalogoDaFile();
	                break;
	        }
	    }
	    
	    private static void aggiungiLettura() {
	        System.out.println("Hai scelto di aggiungere una lettura. Seleziona il tipo.");
	        System.out.println("1. per Libro; 2. per Rivista");
	        int tipo;
	        while (true) {
	            try {
	                tipo = Integer.parseInt(scan.nextLine());
	                if (tipo != 1 && tipo != 2) {
	                    System.out.println("Scelta non valida.");
	                } else {
	                    break;
	                }
	            } catch (NumberFormatException e) {
	                System.out.println("Scelta non valida. Premi 1 per Libro oppure 2 per Rivista");
	            }
	        }

	        System.out.println("Codice ISBN:");
	        String isbn = scan.nextLine();
	        if (isbn == null || isbn.trim().isEmpty()) {
	            System.out.println("Il codice ISBN deve essere presente");
	            return;
	        }

	        System.out.println("Titolo:");
	        String titolo = scan.nextLine();
	        if (titolo == null || titolo.trim().isEmpty()) {
	            System.out.println("Scrivi un titolo:");
	            return;
	        }

	        System.out.println("Anno di uscita:");
	        int anno = Integer.parseInt(scan.nextLine());
	        if (anno <= 0) {
	            System.out.println("L'anno deve essere un numero positivo");
	            return;
	        }


	        System.out.println("Numero di pagine:");
	        int pag = Integer.parseInt(scan.nextLine());
	        if (pag <= 0) {
	            System.out.println("Il numero di pagine deve essere positivo");
	            return;
	        }

	        if(tipo == 1) {
	            System.out.println("Autore:");
	            String autore = scan.nextLine();
	            if (autore == null || autore.trim().isEmpty()) {
	                System.out.println("Scrivi il nome dell'autore");
	                return;
	            }

	            System.out.println("Genere:");
	            String genere = scan.nextLine();
	            if (genere == null || genere.trim().isEmpty()) {
	                System.out.println("Scrivi il genere");
	                return;
	            } 
	            catalogo.aggiungiLettura(new Libro(isbn, titolo, anno, pag, autore, genere));

	        } else if(tipo == 2) {
	            System.out.println("Frequenza: (SETTIMANALE, MENSILE, ANNUALE)");
	            String periodoStr = scan.nextLine();
	            Magazine.Frequenza periodo = null;
	            try {
	                periodo = Magazine.Frequenza.valueOf(periodoStr.toUpperCase());
	            } catch (IllegalArgumentException e) {
	                System.out.println("Ci dispiace, la scelta è tra le seguenti: SETTIMANALE, MENSILE, ANNUALE");
	                return;
	            }
	            catalogo.aggiungiLettura(new Magazine(isbn, titolo, anno, pag, periodo));
	        } else {
	            System.out.println("Seleziona un numero valido");
	        }
	    }

	    private static void rimuoviLettura() {
	        System.out.println("Inserisci il codice ISBN della lettura da rimuovere:");
	        String isbn = scan.nextLine();
	        boolean successo = catalogo.rimuoviLettura(isbn);
	        if (successo) {
	            System.out.println("Lettura rimossa con successo!");
	        } else {
	            System.out.println("Lettura non trovata.");
	        }
	    }
	    
	    private static void cercaPerISBN() {
	        System.out.println("Inserisci il codice ISBN della lettura da cercare:");
	        String isbn = scan.nextLine();
	        Optional<Lettura> risultato = catalogo.cercaISBN(isbn);
	        if (risultato.isPresent()) {
	            System.out.println(risultato.get());
	        } else {
	            System.out.println("Lettura non trovata.");
	        }
	    }
	    
	    private static void cercaPerAnnoPubblicazione() {
	        System.out.println("Inserisci l'anno di pubblicazione della lettura da cercare:");
	        int anno = Integer.parseInt(scan.nextLine());
	        List<Lettura> risultati = catalogo.cercaAnno(anno);
	        if (risultati.isEmpty()) {
	            System.out.println("Nessuna lettura trovata per l'anno " + anno);
	        } else {
	            System.out.println("Letture trovate per l'anno " + anno + ":");
	            for (Lettura l : risultati) {
	                System.out.println(l);
	            }
	        }
	    }
	    
	    private static void cercaPerAutore() {
	        System.out.println("Inserisci il nome dell'autore:");
	        String autore = scan.nextLine();
	        List<Libro> risultati = catalogo.cercaAutore(autore);
	        if (risultati.isEmpty()) {
	            System.out.println("Nessuna lettura trovata per l'autore " + autore);
	        } else {
	            System.out.println("Letture trovate per l'autore " + autore + ":");
	            for (Lettura l : risultati) {
	                System.out.println(l);
	            }
	        }
	    }
	    
	    private static void salvaCatalogoSuFile() {
	        try {
	            catalogo.scriviDisk();;
	            System.out.println("Catalogo salvato con successo!");
	        } catch (IOException e) {
	            System.out.println("Errore durante il salvataggio del catalogo.");
	            e.printStackTrace();
	        }
	    }
	    
	    private static void leggiCatalogoDaFile() {
	        try {
	        	catalogo.leggiDisk();
	            System.out.println("Catalogo letto con successo!");
	        } catch (IOException e) {
	            System.out.println("Errore durante la lettura del catalogo.");
	            e.printStackTrace();
	        }
	    }
}
