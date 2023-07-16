package module19;

import java.util.Arrays;

import static module17.Reader.readInputNumber;

public class Task42 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantityOne = readInputNumber();
        int[] arrayOne = new int[arrayQuantityOne];
        fillTheArray(arrayOne);
        printArray(arrayOne);

        System.out.println();

        int arrayQuantityTwo = readInputNumber();
        int[] arrayTwo = new int[arrayQuantityTwo];
        fillTheArray(arrayTwo);
        printArray(arrayTwo);

        System.out.println();
        int[] newArray = createnewTheArray(arrayOne, arrayTwo, arrayQuantityOne, arrayQuantityTwo);

        sortArray(newArray);
        printArray(newArray);
    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            } else {
                array[i] = getHigherRandomNumber(array[i - 1]);
            }
        }
    }

    private static int getHigherRandomNumber(int value) {
        int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        while (newNumber < value) {
            newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return newNumber;
    }

    private static int[] createnewTheArray(int[] arrayOne, int[] arrayTwo, int quantityOne, int quantityTwo) {

        int index = 0;
        int[] mergedArray = new int[quantityOne + quantityTwo];
        for (int value : arrayOne) {
            mergedArray[index] = value;
            index++;
        }
        for (int value : arrayTwo) {
            mergedArray[index] = value;
            index++;
        }
        return mergedArray;
    }

    public static void sortArray(int[] array) {
        boolean isSorted = false;
        int tempValue;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    tempValue = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = tempValue;
                    isSorted = false;
                }
            }
        }
    }
}

