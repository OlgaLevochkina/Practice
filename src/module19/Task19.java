package module19;

import static module17.Reader.readInputNumber;

public class Task19 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            } else {
                array[i] = getHigherRandomNumber(array[i - 1]);
            }
        }
    }

    private static int getHigherRandomNumber(int value) {
        int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        while (newNumber > value) {
            newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return newNumber;
    }
}
