package module19;

import static module17.Reader.readInputNumber;

public class Task52 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[arrayQuantity];
        fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        int[] arrayTwo = new int[arrayQuantity];
        fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        int[] newArray = createNewArray(arrayOne, arrayTwo);
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

    private static int[] createNewArray(int[] arrayOne, int[] arrayTwo) {
        int[] newArray = new int[arrayOne.length + arrayOne.length * arrayTwo.length];
        int index = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            newArray[index] = arrayOne[i];
            index++;
            for (int j = 0; j < arrayTwo.length; j++) {
                newArray[index] = arrayTwo[j];
                index++;
            }
        }
        return newArray;
    }
}
