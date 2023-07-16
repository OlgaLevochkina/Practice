package module19;

import static module17.Reader.readInputNumber;

public class Task56 {
    public static final int MIN = 10;
    public static final int MAX = 100;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = buildNewArray(array);
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


    private static int findEvenElements(int[] array) {
        int countEvenElements = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                countEvenElements++;
            }
        }
        return countEvenElements;
    }

    private static int[] buildNewArray(int[] array) {
        int countEvenElements = findEvenElements(array);
        int[] newArray = new int[countEvenElements];
        int index = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                newArray[index] = value;
                index++;
            }
        }
        return newArray;
    }
}
