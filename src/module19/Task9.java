package module19;

import static module17.Reader.readInputNumber;

public class Task9 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomEvenNumber();
        }
    }

    private static int getRandomEvenNumber() {
        int number = 1;
        while (number % 2 != 0) {
            number = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return number;
    }
}
