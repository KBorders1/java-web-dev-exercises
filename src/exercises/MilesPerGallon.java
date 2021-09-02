package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Miles driven:");
        Double miles = input.nextDouble();

        System.out.println("Gallons of fuel used:");
        Double gallons = input.nextDouble();

        Double mpg = miles / gallons;
        System.out.println("Miles per gallon = " + mpg);
    }
}
