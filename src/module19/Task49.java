package module19;

import java.util.Arrays;

public class Task49 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //  int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[]{2, 3, 1};   // should be smaller
        int[] arrayTwo = new int[]{1, 2, 3, 4, 2, 3, 1};   // should be bigger
        // fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        //fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        System.out.println(checkIfContains(arrayOne, arrayTwo));
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

    public static boolean checkIfContains(int[] arrayOne, int[] arrayTwo) { //peredelat
        int i = 0, j = 0;
        while (i < arrayOne.length && j < arrayTwo.length) {
            if (arrayOne[i] == arrayTwo[j]) {
                i++;
                j++;
            } else if (arrayOne[i] > arrayTwo[j]) {
                j++;
            } else {
                return false;
            }
        }
        return i == arrayOne.length;
    }

}
