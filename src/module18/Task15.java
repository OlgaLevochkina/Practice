package module18;

import static module17.Reader.readInputNumber;

public class Task15 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        printEven(array);
        System.out.println();
        printUnEven(array);

    }

    public static void printEven(int[] array) {
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(i + ": " + array[i] + " ");
        }
    }

    public static void printUnEven(int[] array) {
        for (int i = 1; i < array.length; i += 2) {
            System.out.print(i + ": " + array[i] + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task15.MIN + (int) ((Task15.MAX - Task15.MIN + 1) * Math.random());
        }
    }
}
