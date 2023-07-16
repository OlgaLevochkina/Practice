package module19;

import static module17.Reader.readInputNumber;

public class Task38 {
    public static final int MIN = 1;
    public static final int MAX = 5;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        findAllIndexesWithMaxValue(array);
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

    private static int findMaxValue(int[] array) {
        int maxValue = array[0];
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }
        return array[maxIndex];
    }

    private static void findAllIndexesWithMaxValue(int[] array) {
        int maxValue = findMaxValue(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                System.out.print(i + " ");
            }
        }
    }
}
