package module19;

import static module17.Reader.readInputNumber;

public class Task71 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(makeArrayComplete(array));


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

    public static int[] makeArrayComplete(int[] array) {
        int[] newArray = new int[array.length];
        int countIterations = 0;
        boolean isComplete = true;
        while (isComplete) {
            isComplete = false;
            for (int value : array) {
                for (int j = 1; j <= array.length; j++) {
                    if (value == j) {
                        isComplete = true;
                        break;
                    }
                }
            }
        }
        return newArray;
    }
}
