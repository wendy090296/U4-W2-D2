package exercise1;


import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words = new HashSet<>();// set di parole distinte
        List<String> duplicates = new ArrayList<>(); // lista parole duplicate

        System.out.println("Inserisci il numero di elementi seguito dal tasto Invio. Inserisci 0 per uscire");
        int numElementi = scanner.nextInt();

        if (numElementi > 0) {

            for (int i = 0; i < numElementi; i++) {
                System.out.println("Aggiungi una parola al set");
                String word = scanner.nextLine();
                boolean added = words.add(word);
                if (!added) {
                    System.out.println(word + " è già nell'elenco");
                    duplicates.add(word);
                }
            }

            System.out.println("Numero di parole distinte: " + words.size());
            System.out.println("Elenco delle parole distinte: " + words);
            System.out.println("Elenco delle parole duplicate: " + duplicates);
        } else {
            System.err.println("Non va bene un numero minore uguale a zero");
        }

        scanner.close();
    }
}
