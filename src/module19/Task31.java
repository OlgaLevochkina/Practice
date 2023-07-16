package module19;

import static module17.Reader.readInputNumber;

public class Task31 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        int arrayIndex = readInputNumber();
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfLower(array, arrayIndex));
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

    private static boolean checkIfLower(int[] array, int arrayIndex) {
        boolean isLower = true;
        for (int i = 0; i < arrayIndex; i++) {
            int nextIndex = i + 1;
            if (nextIndex != array.length && array[i] < array[nextIndex]) {
                isLower = false;
                break;
            }
        }
        return isLower;
    }
}
