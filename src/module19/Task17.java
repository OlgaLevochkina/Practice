package module19;

import static module17.Reader.readInputNumber;

public class Task17 {
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
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        for (int i = 0; i < mid; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            array[mid + i] = array[i];
        }
    }
}
