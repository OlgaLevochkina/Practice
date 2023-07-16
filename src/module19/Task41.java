package module19;

import static module17.Reader.readInputNumber;

public class Task41 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        printArray(createReverseTheArray(array, array.length));
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

    private static int[] createReverseTheArray(int[] array, int quantity) {
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        int index = 0;
        int[] reverseArray = new int[quantity];
        for (int i = mid; i < array.length; i++) {
            reverseArray[index] = array[i];
            index++;
        }
        for (int j = 0; j < mid; j++) {
            reverseArray[index] = array[j];
            index++;
        }
        return reverseArray;
    }
}
