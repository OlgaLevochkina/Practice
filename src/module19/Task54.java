package module19;

import static module17.Reader.readInputNumber;

public class Task54 {
    public static final int MIN = -10;
    public static final int MAX = 10;
    public static boolean doesContainZero = false;

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


    private static int findPositiveElement(int[] array) {
        int positiveElements = 0;
        for (int j : array) {
            if (j > 0) {
                positiveElements++;
            } else if (j == 0) {
                doesContainZero = true;
            }
        }
        return positiveElements;
    }

    private static int findNeutralElements(int[] array) {
        int countNeutral = 0;
        for (int j : array) {
            if (j == 0) {
                countNeutral++;
            }
        }
        return countNeutral;
    }

    private static int[] buildNewArray(int[] array) {
        int positive = findPositiveElement(array);
        int zero = findNeutralElements(array);
        int[] newArray = new int[array.length];
        int indexStart = 0;
        int indexMiddle = positive;
        int indexEnd = positive + zero;
        for (int value : array) {
            if (value > 0) {
                newArray[indexStart] = value;
                indexStart++;
            } else if (value == 0) {
                newArray[indexMiddle] = value;
                indexMiddle++;
            } else {
                newArray[indexEnd] = value;
                indexEnd++;
            }
        }
        return newArray;
    }
}
