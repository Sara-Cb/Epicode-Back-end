package exercise3;

public class Main {
    public static void main(String[] args) {
        RubricaTelefonica rubrica = new RubricaTelefonica();
        rubrica.inserisciContatto("Mario", "1234567890");
        rubrica.inserisciContatto("Luigi", "0987654321");
        rubrica.inserisciContatto("Giuseppe", "5555555555");

        System.out.println("Tutti i contatti:");
        rubrica.stampaContatti();

        System.out.println("\nEliminazione di Luigi:");
        rubrica.eliminaContatto("Luigi");
        rubrica.stampaContatti();

        System.out.println("\nRicerca del numero di telefono di Giuseppe:");
        System.out.println(rubrica.ricercaNumero("Giuseppe"));

        System.out.println("\nRicerca della persona con numero di telefono 1234567890:");
        System.out.println(rubrica.ricercaPersona("1234567890"));
    }
}
