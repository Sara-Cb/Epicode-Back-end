package ex2;

public class Chiamata {
	private String numeroChiamato;
    private int minuti;

    public Chiamata(double minuti, String numeroChiamato) {
        this.minuti = minuti;
        this.numeroChiamato = numeroChiamato;
    }

    public void stampa() {
        System.out.println("Numero: " + numeroChiamato);
        System.out.println("Minuti: " + minuti);
    }
}