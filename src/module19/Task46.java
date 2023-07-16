package module19;

import static module17.Reader.readInputNumber;

public class Task46 {
    public static final int MIN = 10;
    public static final int MAX = 100;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int k = readInputNumber();
        createNewArray(array, k);
        printArray(array);
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

    private static void createNewArray(int[] array, int k) {
        if (k > 0) {
            shiftRight(array);
        } else {
            shiftLeft(array);
        }
    }

    private static void shiftLeft(int[] array) {
        int temporaryElement = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        array[array.length - 1] = temporaryElement;
    }

    private static void shiftRight(int[] array) {
        int lastElement = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElement;
    }
}
