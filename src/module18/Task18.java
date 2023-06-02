package module18;

import static module17.Reader.readInputNumber;

public class Task18 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        print(array);
    }

    public static void print(int[] array) {
        int temporary = array.length / 2;
        for (int i = 0; i <= temporary; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = array.length - 1; i > temporary; i--) {
            System.out.print(array[i] + " ");
        }
    }


    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int k = (int) (100 * Math.random());
            array[i] = Task18.MIN + (int) ((Task18.MAX - Task18.MIN + 1) * Math.random());
            if (k % 2 == 0) {
                array[i] = -array[i];
            }
        }
    }
}
