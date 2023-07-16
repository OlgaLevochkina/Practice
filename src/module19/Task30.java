package module19;

import static module17.Reader.readInputNumber;

public class Task30 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfHigher(array));
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

    private static boolean checkIfHigher(int[] array) {
        boolean isHigher = true;
        for (int i = 0; i < array.length; i++) {
            int nextIndex = i + 1;
            if (nextIndex != array.length && array[i] > array[nextIndex]) {
                isHigher = false;
                break;
            }
        }
        return isHigher;
    }
}

