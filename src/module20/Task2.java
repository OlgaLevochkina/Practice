package module20;

import static module17.Reader.readInputNumber;

public class Task2 {
    public static final int MIN = -10;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println("Sum positive, sum negative, count Zero:");
        printArray(countAllValues(array));
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

    public static int[] countAllValues(int[] array) {
        int[] newArray = new int[3];
        int sumNegative = 0;
        int sumPositive = 0;
        int countZero = 0;
        for (int value : array) {
            if (value > 0) {
                sumPositive += value;
            } else if (value < 0) {
                sumNegative += value;
            } else {
                countZero++;
            }
        }
        newArray[0] = sumPositive;
        newArray[1] = sumNegative;
        newArray[2] = countZero;
        return newArray;
    }
}
