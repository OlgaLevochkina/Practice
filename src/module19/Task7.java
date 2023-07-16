package module19;

import static module17.Reader.readInputNumber;

public class Task7 {
    public static final int MIN = 0;
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
            array[i] = Task8.MIN + (int) ((Task8.MAX - Task8.MIN + 1) * Math.random());
        }
    }
}
