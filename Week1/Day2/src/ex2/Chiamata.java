package ex2;

public class Chiamata {
	public String numeroChiamato;
    public int minuti;

    public Chiamata(String numeroChiamato, int minuti) {
    	this.numeroChiamato = numeroChiamato;
        this.minuti = minuti;
    }

    public void stampa() {
        System.out.println("Numero: " + numeroChiamato);
        System.out.println("Minuti: " + minuti);
    }
}