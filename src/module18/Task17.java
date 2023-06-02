package module18;

import static module17.Reader.readInputNumber;

public class Task17 {
    public static final int MIN = 100;
    public static final int MAX = 999;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        print(array);
    }

    public static void print(int[] array) {
        int mid = array.length / 2;
        for (int i = 0; i <= mid; i++) {
            if (array[i] == array[array.length - i - 1]) {
                System.out.println(array[i]);
            } else {
                System.out.println(array[i] + " " + array[array.length - i - 1]);
            }
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Task17.MIN + (int) ((Task17.MAX - Task17.MIN + 1) * Math.random());
        }
    }
}

