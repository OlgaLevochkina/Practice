package module19;

import java.util.Arrays;

import static module17.Reader.readInputNumber;

public class Task43 {
    public static final int MIN = 1;
    public static final int MAX = 10;

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
        int[] newArray = createNewArray(arrayOne, arrayTwo, arrayQuantityOne, arrayQuantityTwo);
        System.out.println();

        sortArray(newArray);

        int totalQuantity = newArray.length;
        int j = removeDuplicateElements(newArray, totalQuantity);
        printNewArray(newArray, j);
    }


    public static void printNewArray(int[] array, int j) {
        for (int i = 0; i < j; i++) {
            System.out.print(array[i] + " ");
        }
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

    private static int[] createNewArray(int[] arrayOne, int[] arrayTwo, int quantityOne, int quantityTwo) {

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

   // public static int[] removeDuplicate(int[] array) {
//        return Arrays.stream(array).distinct().toArray();
//    }

    public static int removeDuplicateElements(int[] array, int quantity) {
        if (quantity == 0 || quantity == 1) {
            return quantity;
        }
        int j = 0;
        for (int i = 0; i < quantity - 1; i++) {
            if (array[i] != array[i + 1]) {
                array[j++] = array[i];
            }
        }
        array[j++] = array[quantity - 1];

        return j;
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
