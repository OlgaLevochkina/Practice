package module19;

import static module17.Reader.readInputNumber;

public class Task58 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantityOne = readInputNumber();
        int[] arrayOne = new int[arrayQuantityOne];
        fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        int arrayQuantityTwo = readInputNumber();
        int[] arrayTwo = new int[arrayQuantityTwo];
        fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        System.out.println(countSameElements(arrayOne, arrayTwo));

    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }
    }


    public static int countSameElements(int[] arrayOne, int[] arrayTwo) {
        int count = 0;

        for (int k : arrayOne) {
            for (int i : arrayTwo) {
                if (k == i) {
                    count++;
                }
            }
        }
        return count;
    }
}
