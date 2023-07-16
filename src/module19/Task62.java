package module19;

import static module17.Reader.readInputNumber;

public class Task62 {
    public static final int MIN = 1;
    public static final int MAX = 2;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] arrayOne = new int[quantity];
        fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        int[] arrayTwo = new int[quantity];
        fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        int[] newArray = buildNewArrayWithSameElements(arrayOne, arrayTwo);
        printArray(newArray);

    }

    public static void printArray(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
    }

    public static int countSameElements(int[] arrayOne, int[] arrayTwo) {
        int count = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                count++;
            }
        }

        return count;
    }

    public static int[] buildNewArrayWithSameElements(int[] arrayOne, int[] arrayTwo) {
        int[] tempArray = new int[countSameElements(arrayOne, arrayTwo)];
        int index = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                tempArray[index] = arrayOne[i];
                index++;
            }
        }

        return tempArray;
    }
}
