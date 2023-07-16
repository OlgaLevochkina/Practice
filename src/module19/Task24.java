package module19;

import static module17.Reader.readInputNumber;

public class Task24 {
    public static final int MIN = -99;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfPositive(array));
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
    }

    public static boolean checkIfPositive(int[] array) {
        boolean isPositive = true;
        for (int value : array) {
            if (value >= 0) {
                isPositive = false;
                break;
            }
        }

        return isPositive;
    }
}
