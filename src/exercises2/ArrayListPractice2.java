package exercises2;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice2 {



    public static void wordLength(ArrayList<String> arr) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word length: ");
        int numChars = input.nextInt();

        for (String word : arr) {
            if (word.length() == numChars) {
                System.out.println(word);
            }
        }

    }

    public static void main(String[] args) {
        ArrayList<String> sampleWords = new ArrayList<>();
        sampleWords.add("hello");
        sampleWords.add("never");
        sampleWords.add("absolute");
        sampleWords.add("happy");
        sampleWords.add("marvelous");
        sampleWords.add("to");

        wordLength(sampleWords);
    }
}
