package module19;

import static module17.Reader.readInputNumber;

public class Task13 {

    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
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
        int sum = number / 10 + number % 10;
        while (sum % 9 == 0) {
            number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            sum = number / 10 + number % 10;
        }
        return number;
    }
}
