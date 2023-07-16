package module19;

import static module17.Reader.readInputNumber;

public class Task12 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
        fillTheArray(array);
        printArray(array);
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomDesiredNumber();
        }
    }

    private static int getRandomDesiredNumber() {
        int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
        int firstDigit = number / 10;
        int lastDigit = number % 10;
        while (firstDigit > lastDigit) {
            number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            firstDigit = number / 10;
            lastDigit = number % 10;
        }
        return number;
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
