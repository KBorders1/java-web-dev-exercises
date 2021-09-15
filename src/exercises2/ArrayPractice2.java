package exercises2;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String testString = "I would not, could not, in a box. I would not," +
                " could not with a fox. I will not eat them in a house. I will" +
                " not eat them with a mouse.";

        String[] sentences = testString.split("\\.");

        System.out.println(Arrays.toString(sentences));

    }
}
