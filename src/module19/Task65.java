package module19;

import static module17.Reader.readInputNumber;

public class Task65 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //    int quantity = readInputNumber();
        int[] array = new int[]{3, 5, 7, 2, -3, 5, 8, -4};
        //      fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfValueThere(array));

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

    private static int findSumBefore(int[] array, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += array[i];
        }
        return sum;
    }

    private static int findSumAfter(int[] array, int index) {
        int sum = 0;
        for (int i = index + 1; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static boolean checkIfValueThere(int[] array) {
        boolean isThere = false;
        for (int i = 1; i < array.length; i++) {
            int sumBefore = findSumBefore(array, i);
            int sumAfter = findSumAfter(array, i);
            if (sumBefore == sumAfter) {
                isThere = true;
                break;
            }
        }
        return isThere;
    }
}
