package exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Length of rectangle:");
        int length = input.nextInt();

        System.out.println("Width of rectangle:");
        int width = input.nextInt();

        int area = length * width;
        System.out.println("The area of this rectangle is " + area);
    }
}
