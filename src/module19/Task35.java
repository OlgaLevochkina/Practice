package module19;

import static module17.Reader.readInputNumber;

public class Task35 {
    public static final int MIN = 10;
    public static final int MAX = 99;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println("The average score is " + findAverage(array));
        System.out.println("The number of values higher than average is " + findHigherThanAvr(findAverage(array), array));
        System.out.println("The number of values lower than average is " + findLowerThanAvr(findAverage(array), array));

        System.out.println(findHigherThanAvr(findAverage(array), array) == findLowerThanAvr(findAverage(array), array));
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

    private static int findAverage(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static int findHigherThanAvr(int average, int[] array) {
        int countH = 0;
        for (int value : array) {
            if (value > average) {
                countH++;
            }
        }
        return countH;
    }

    public static int findLowerThanAvr(int average, int[] array) {
        int countL = 0;
        for (int value : array) {
            if (value < average) {
                countL++;
            }
        }
        return countL;
    }
}
