package module18;

import static module17.Reader.readInputNumber;

public class Task13 {
    public static final int MIN = 1000;
    public static final int MAX = 9999;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        print(array);
    }

    private static void print(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(i + ": " + array[i] + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task13.MIN + (int) ((Task13.MAX - Task13.MIN + 1) * Math.random());
        }
    }
}
