package module19;

import static module17.Reader.readInputNumber;

public class Task70 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //       int quantity = readInputNumber();
        int[] array = new int[]{1, 2, 3, 5, 3};
        //       fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfComplete(array));
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

    private static boolean checkIfAllElementsUnique(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkIfComplete(int[] array) {
        boolean isComplete = true;
        for (int j = 1; j <= array.length; j++) {
            boolean isThere = false;
            for (int i = 0; i < array.length; i++) {
                if (j == array[i]) {
                    isThere = true;
                    break;
                }
            }
            if (!isThere) {
                isComplete = false;
                break;
            }
        }
        return isComplete;
    }
}
