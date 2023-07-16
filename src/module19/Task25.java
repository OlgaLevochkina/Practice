package module19;

import static module17.Reader.readInputNumber;

public class Task25 {
    public static final int MIN = 1;
    public static final int MAX = 5;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        int x = readInputNumber();
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfThere(array, x));
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

    public static boolean checkIfThere(int[] array, int x) {
        boolean isThere = false;
        int sum = 0;
        for (int value : array) {
            sum += value;
            if (sum == x) {
                isThere = true;
                break;
            }
            sum = value;
        }
        return isThere;
    }
}
