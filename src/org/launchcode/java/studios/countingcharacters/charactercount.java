package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class charactercount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String userInput = input.nextLine();
        userInput = userInput.replaceAll("[^a-zA-Z]", "").toLowerCase();



        HashMap<Character, Integer> characterCount = new HashMap<>();

        /*String sample = "If the product of two terms is zero then common sense" +
                " says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the" +
                " quadratics into a form that can be factored allowing that side of" +
                " the equation to equal zero. Once you’ve done that, it’s pretty" +
                " straightforward from there.";*/

        char[] charactersInString = userInput.toCharArray();

        for(char c : charactersInString) {
            if (!characterCount.containsKey(c)) {
                characterCount.put(c, 1);
            } else {
                characterCount.put(c, characterCount.get(c) + 1);
            }

        }

        for (Map.Entry<Character, Integer> character : characterCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}
