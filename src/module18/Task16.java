package module18;

import java.util.Arrays;

import static module17.Reader.readInputNumber;

public class Task16 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        print(array);
    }

    public static void print(int[] array) {
        int[] evenValue = new int[array.length];
        int evenValueSize = 0;
        int unEvenValueSize = 0;
        int[] unEvenValue = new int[array.length];
        for (int value : array) {
            if (value % 2 == 0) {
                evenValue[evenValueSize] = value;
                evenValueSize++;
            } else {
                unEvenValue[unEvenValueSize] = value;
                unEvenValueSize++;
            }
        }
        System.out.print(Arrays.toString(evenValue) + " ");
        System.out.println();
        System.out.print(Arrays.toString(unEvenValue) + " ");
    }

    public static void printUnEvenValue(int[] array) {
        for (int value : array) {
            if (value % 2 != 0)
                System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task16.MIN + (int) ((Task16.MAX - Task16.MIN + 1) * Math.random());
        }
    }
}
