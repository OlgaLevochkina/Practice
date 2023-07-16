package module19;

import static module17.Reader.readInputNumber;

public class Task14 {

    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {

        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillArray(array);
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    public static void fillArray(int[] array) {
        int firstNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        array[0] = firstNumber;
        for (int i = 1; i < array.length; i++) {
            int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            int firstDigit = number / 10;
            array[i] = firstDigit * 10 + array[i - 1] / 10;
        }
    }
}
