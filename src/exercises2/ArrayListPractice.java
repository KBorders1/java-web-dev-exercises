package exercises2;


import java.util.ArrayList;

public class ArrayListPractice {

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        ArrayList<Integer> someInts = new ArrayList<>();
        someInts.add(1);
        someInts.add(2);
        someInts.add(3);
        someInts.add(4);
        someInts.add(5);
        someInts.add(6);
        someInts.add(7);
        someInts.add(8);
        someInts.add(9);
        someInts.add(10);

        System.out.println(sumEven(someInts));





    }


}
