package module19;

import static module17.Reader.readInputNumber;

public class Task40 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        createReverseTheArray(array, arrayQuantity);
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

    private static void createReverseTheArray(int[] array, int quantity) {
        int[] reverseArray = new int[quantity];
        int arrayQuantity = quantity;
        for (int i = 0; i < quantity; i++) {
            reverseArray[arrayQuantity - 1] = array[i];
            arrayQuantity--;
        }
        for (int j = 0; j < quantity; j++) {
            System.out.print(reverseArray[j] + " ");
        }
    }
}
