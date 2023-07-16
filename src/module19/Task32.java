package module19;

import static module17.Reader.readInputNumber;

public class Task32 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        int arrayIndexOne = readInputNumber();
        int arrayIndexTwo = readInputNumber();
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfHigher(array, arrayIndexOne, arrayIndexTwo));
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

    public static boolean checkIfHigher(int[] array, int arrayIndexOne, int arrayIndexTwo) {
        boolean isHigher = true;
        for (int i = arrayIndexOne; i < arrayIndexTwo; i++) {
            while (isHigher) {
                isHigher = array[i] < array[i + 1];
                i++;
            }
        }
        return isHigher;
    }
}
