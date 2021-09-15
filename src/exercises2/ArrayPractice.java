package exercises2;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someInts = {1, 1, 2, 3, 5, 8};

        for (int i : someInts) {
            if (i % 2 == 1) {
                System.out.println(i);
            }

        }
    }
}
