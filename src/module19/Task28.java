package module19;

import static module17.Reader.readInputNumber;

public class Task28 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        int arrayIndex = readInputNumber();
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(findSum(array, arrayIndex));
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

    public static int findSum(int[] array, int arrayIndex) {
        int sum = 0;
        for (int i = arrayIndex; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
}
