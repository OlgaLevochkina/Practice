package module19;

import java.util.Arrays;

import static module17.Reader.readInputNumber;

public class Task47 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //  int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[]{7, 4, 3};
        int[] arrayTwo = new int[]{7, 7, 3};
        // fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        //fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        checkIfTheSame(arrayOne, arrayTwo);


    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
    }

    public static void checkIfTheSame(int[] arrayOne, int[] arrayTwo) {
        if (Arrays.equals(arrayOne, arrayTwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Not the same");
        }
    }
}
