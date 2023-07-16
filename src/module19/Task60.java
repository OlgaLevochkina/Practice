package module19;

import static module17.Reader.readInputNumber;

public class Task60 {
    public static final int MIN = 10;
    public static final int MAX = 20;

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
        int[] newArray = buildNewArray(arrayOne, arrayTwo);
        printArray(newArray);

    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            } else {
                array[i] = getUniqueElement(array[i]);
            }
        }
    }

    private static int getUniqueElement(int value) {
        int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        while (newNumber == value) {
            newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
        return newNumber;
    }

    private static int countUniqueElements(int[] arrayOne, int[] arrayTwo) {
        int count = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            boolean flag = false;
            for (int j = 0; j < arrayTwo.length; j++) {
                if (arrayOne[i] == arrayTwo[j]) {
                    flag = true;
                }
            }
            if (!flag)
                count++;

        }
        return count;
    }


    public static int[] buildNewArray(int[] arrayOne, int[] arrayTwo) {
        int[] newArray = new int[countUniqueElements(arrayOne, arrayTwo)];
        int value = 0;
        for (int j : arrayOne) {
            boolean flag = false;
            for (int k : arrayTwo) {
                if (j == k) {
                    flag = true;
                    break;
                }

            }
            if (!flag) {
                newArray[value] = j;
                value++;
            }
        }
        return newArray;
    }
}
