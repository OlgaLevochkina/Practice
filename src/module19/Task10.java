package module19;

import static module17.Reader.readInputNumber;

public class Task10 {
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
            array[i] = getRandomDesiredNumber();
        }
    }

    private static int getRandomDesiredNumber() {
        int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
        while (number % 3 != 1) {
            number = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return number;
    }
}
