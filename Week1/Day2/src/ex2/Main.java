package ex2;

public class Main {
    public static void main(String[] args) {
        Sim sim = new Sim("3331231234");
        sim.ricaricaSim(12.50);
        sim.aggiungiChiamata("3331231111", 5);
        sim.aggiungiChiamata("3331232222", 6);
        sim.aggiungiChiamata("3331233333", 5);
        sim.aggiungiChiamata("3331234444", 1);
        sim.aggiungiChiamata("3331235555", 2);
        sim.aggiungiChiamata("3331236666", 3);
        sim.stampa();
    }
}