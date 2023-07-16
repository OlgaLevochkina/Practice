package module19;

import static module17.Reader.readInputNumber;

public class Task6 {
    public static void main(String[] args) {
        int number = readInputNumber();
        int[] array = new int[number];
        fillTheArray(array);
        printArray(array);
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = readInputNumber();
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
