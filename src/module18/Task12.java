package module18;

import static module17.Reader.readInputNumber;

public class Task12 {
    public static final int MIN = 100;
    public static final int MAX = 999;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        print(array);

    }

    private static void print(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task12.MIN + (int) ((Task12.MAX - Task12.MIN + 1) * Math.random());
        }
    }
}
