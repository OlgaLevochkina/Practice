package module19;

import java.util.Arrays;

public class Task51 {
    public static void main(String[] args) {

        //  int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[]{1, 2, 3, 4};
        int[] arrayTwo = new int[]{6, 7, 8, 9};
        //   fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        //  fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        System.out.println(Arrays.toString(createNewTheArray(arrayOne, arrayTwo, 4, 4)));


    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

//    private static void fillTheArray(int[] array) {
//        for (int i = 0; i < array.length; i++) {
//            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
//        }
//    }

    private static int[] createNewTheArray(int[] arrayOne, int[] arrayTwo, int quantityOne, int quantityTwo) {

        int index = 0;
        int arrayQuantity = quantityOne + quantityTwo;
        int[] mergedArray = new int[arrayQuantity];
        for (int i = 0; i < arrayOne.length; i++) {
            index = addArrayValue(mergedArray, arrayOne[i], index);
            index = addArrayValue(mergedArray, arrayTwo[i], index);
        }
        return mergedArray;
    }

    private static int addArrayValue(int[] array, int value, int index) {
        array[index] = value;
        index++;
        return index;
    }
}
