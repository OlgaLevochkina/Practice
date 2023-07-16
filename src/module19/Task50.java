package module19;

import static module17.Reader.readInputNumber;

public class Task50 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {

        //  int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[]{4, 6, 7, 2, 5, 3};
        int[] arrayTwo = new int[]{5, 6, 2, 2, 4, 3};
        //   fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        //  fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        System.out.println(checkIfIndexAndValueIsTheSame(arrayOne, arrayTwo));


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

    public static int checkIfIndexAndValueIsTheSame(int[] arrayOne, int[] arrayTwo) {
        int count = 0;
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] == arrayTwo[i]) {
                count++;
            }
        }
        return count;
    }
}
