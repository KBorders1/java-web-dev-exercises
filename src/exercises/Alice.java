package exercises;

import java.util.Locale;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String firstSentence = "Alice was beginning to get very tired of" +
                " sitting by her sister on the bank, and of having nothing" +
                " to do: once or twice she had peeped into the book her sister" +
                " was reading, but it had no pictures or conversations in it," +
                " 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        firstSentence = firstSentence.toLowerCase();

        System.out.println("What term to search for?");
        String searchTerm = input.nextLine();
        searchTerm = searchTerm.toLowerCase();

        boolean contains = firstSentence.contains(searchTerm);

        if(contains) {
            System.out.println("Index at " + firstSentence.indexOf(searchTerm));
            System.out.println("Length is " + searchTerm.length());
            String modified = firstSentence.replace(searchTerm, "****");
            System.out.println(modified);
        } else {
            System.out.println(contains);
        }





    }
}
