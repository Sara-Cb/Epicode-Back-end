package exercise1;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;



public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Inserisci il numero di parole: ");
        int n = scan.nextInt();
        scan.nextLine();
        Set<String> parole = new HashSet<>();
        Set<String> paroleDuplicate = new HashSet<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci la parola numero " + (i + 1) + ": ");
            String parola = scan.nextLine();
            if (!parole.add(parola)) {
                paroleDuplicate.add(parola);
            }
        }
        System.out.println("Parole duplicate: " + paroleDuplicate);
        System.out.println("Numero di parole distinte: " + parole.size());
        System.out.println("Elenco delle parole distinte: " + parole);
        scan.close();
    }
}







