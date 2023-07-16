package module19;

import static module17.Reader.readInputNumber;

public class Task55 {
    public static final int MIN = 10;
    public static final int MAX = 100;

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

    public static int[] buildNewArray(int[] array) {
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        int[] newArray = new int[mid];
        int index = 0;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[index];
            index += 2;
        }
        return newArray;
    }
}
