package ex2;

public class Sim {
    private String numero;
    private double credito;
    private Chiamata[] effettuate;

    public Sim(String numero) {
        this.numero = numero;
        this.credito = 0;
        this.effettuate = new Chiamata[5];
    }
    
	
	public void ricaricaSim(double importo) {
		this.credito += importo;
	}

    public void aggiungiChiamata(String numero, int minuti) {
    	if(credito > 0) {
    		
    	for (int i = 0; i < this.effettuate.length; i++) {
    		if(effettuate[i] == null) {
    			effettuate[i] = new Chiamata(numero, minuti);
    			break;
    		}
    	}
    	} else {
			System.out.println("Non hai Credito disponibile");
		}
	}
    
    public void stampa() {
        System.out.println("Numero: " + numero);
        System.out.println("Credito: " + credito);
        for (int i = 0; i < effettuate.length; i++) {
        	Chiamata c = effettuate[i];
            if (c != null) {
                System.out.println("Chiamata " + (i + 1) + " - a: " + c.numeroChiamato + " - min." + c.minuti);
            }
        }
    }

	
}