package module18;

import static module17.Reader.readInputNumber;

public class Task14 {
    public static final int MIN = 100;
    public static final int MAX = 999;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];

        fillTheArray(array);
        print(array);
    }

    public static void print(int[] array) {
        int mid = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
        for (int i = 0; i < array.length; i++) {
            if (i == mid) {
                System.out.println();
            }
            System.out.print(i + ": " + array[i] + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task14.MIN + (int) ((Task14.MAX - Task14.MIN + 1) * Math.random());
        }
    }
}
