package module19;

import static module17.Reader.readInputNumber;

public class Task57 {
    public static final int MIN = 10;
    public static final int MAX = 100;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int x = readInputNumber();
        int[] newArray = buildNewArray(array, x);
        printArray(newArray);
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


    private static int findDesiredElements(int[] array, int x) {
        int count = 0;
        for (int value : array) {
            if (value < x) {
                count++;
            }
        }
        return count;
    }

    private static int[] buildNewArray(int[] array, int x) {
        int count = findDesiredElements(array, x);

        int[] newArray = new int[count];
        int index = 0;
        for (int value : array) {
            if (value < x) {
                newArray[index] = value;
                index++;
            }
        }

        return newArray;
    }
}
