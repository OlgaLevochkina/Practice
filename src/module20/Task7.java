package module20;

import static module17.Reader.readInputNumber;

public class Task7 {
    public static final int MIN = 10;
    public static final int MAX = 99;
    public static final int QUANTITY = 100;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = countEveryDigit(array);
        printArray(newArray);
        System.out.println();
        getHighestValue(newArray);
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

    public static int[] countEveryDigit(int[] array) {
        int[] newArray = new int[100];
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            newArray[index] = newArray[index] + 1;
        }
        return newArray;
    }

    public static void getHighestValue(int[] array) {
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == maxValue) {
                System.out.println(i + " ");
            }
        }

    }
}
