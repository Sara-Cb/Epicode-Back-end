package ex2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("3331231234");
        sim.aggiungiChiamata(new Chiamata(5, "0"));
        sim.aggiungiChiamata(new Chiamata(6, "1"));
        sim.aggiungiChiamata(new Chiamata(5, "2"));
        sim.aggiungiChiamata(new Chiamata(1, "3"));
        sim.aggiungiChiamata(new Chiamata(2, "4"));
        sim.aggiungiChiamata(new Chiamata(3, "5"));
        sim.aggiungiChiamata(new Chiamata(4, "6"));
        sim.stampa();
    }
}