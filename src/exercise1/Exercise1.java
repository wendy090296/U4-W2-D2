package exercise1;


import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> words= new HashSet<>(); // set per parole distinte
        List<String> duplicates = new ArrayList<>(); //lista per parole duplicate


        System.out.println("Hi, please insert a positive number and press Enter or 0 to exit:");
        // input from user
        int n = scanner.nextInt();
        // Set where the words will be memorized

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println("Great, now insert a word to add to the list and press Enter:");
                String word = scanner.nextLine();
                words.add(word); // word added to the Set


                // duplicates words

                boolean added = !words.add(word);
                if (added) {
                    System.out.println(word + " already exists in the set! ");
                    duplicates.add(word);
                }
            }
            System.out.println("The set contains: " + words.size() + " words ");
            System.out.println("NOT-DUPLICATED WORDS: " + words);
            System.out.println("DUPLICATED WORDS: " + duplicates);

        }else{
            System.out.println("The number has to be > 0 !");
        }
        scanner.close();
    }
}
