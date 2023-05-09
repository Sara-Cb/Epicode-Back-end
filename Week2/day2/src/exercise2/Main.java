package exercise2;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = generaListaCasuale(10);
        System.out.println("Lista generata: " + lista);
        List<Integer> listaInvertita = invertiLista(lista);
        System.out.println("Lista invertita: " + listaInvertita);
        stampaElementi(lista, true);
        stampaElementi(lista, false);
    }

    public static List<Integer> generaListaCasuale(int n) {
        Random random = new Random();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101));
        }
        Collections.sort(lista);
        return lista;
    }

    public static List<Integer> invertiLista(List<Integer> lista) {
        List<Integer> listaInvertita = new ArrayList<>(lista);
        Collections.reverse(listaInvertita);
        listaInvertita.addAll(lista);
        return listaInvertita;
    }

    public static void stampaElementi(List<Integer> lista, boolean pari) {
        System.out.print(pari ? "Elementi in posizioni pari: " : "Elementi in posizioni dispari: ");
        for (int i = pari ? 0 : 1; i < lista.size(); i += 2) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
    }
}