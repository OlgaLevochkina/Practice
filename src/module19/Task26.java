package module19;

import static module17.Reader.readInputNumber;

public class Task26 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        int x = readInputNumber();
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfThereT(array, x));
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

    public static boolean checkIfThereT(int[] array, int x) {
        boolean isThere = false;

        for (int k : array) {    //idea sokratila 2 for-a
            int multiplication;
            for (int i : array) {
                multiplication = k * i;
                if (multiplication == x) {
                    isThere = true;
                    break;
                }
            }
        }
        return isThere;
    }
}
