package module19;

import static module17.Reader.readInputNumber;

public class Task63 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int index = readInputNumber();
        System.out.println(findSum(array, index));
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

    public static int findSum(int[] array, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }

        return sum;
    }
}
