package module19;

import static module17.Reader.readInputNumber;

public class Task20 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
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
            if (i == 0) {
                array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            } else {
                array[i] = getUniqueNumber(array, i);
            }
        }
    }

    public static int getUniqueNumber(int[] array, int length) {
        int randomNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        while (!checkIfNumberIsUnique(array, randomNumber, length)) {
            randomNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return randomNumber;
    }

    private static boolean checkIfNumberIsUnique(int[] array, int randomNumber, int length) {
        boolean isUnique = true;
        for (int j = 0; j < length - 1; j++) {
            if (array[j] == randomNumber) {
                isUnique = false;
                break;
            }
        }
        return isUnique;
    }
}
