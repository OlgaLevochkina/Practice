package module19;

import static module17.Reader.readInputNumber;

public class Task15 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int s = readInputNumber();
        int number = readInputNumber();
        int[] array = new int[number];
        fillArray(array, s);
        printArray(array);

    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillArray(int[] array, int s) {
        for (int i = 0; i < array.length; i += 2) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        for (int i = 1; i < array.length; i += 2) {
            array[i] = s - array[i - 1];
        }
    }
}
