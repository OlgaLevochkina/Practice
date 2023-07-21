package module22;

import java.util.Scanner;

public class Task4 {
    public static final int MIN = 0;
    public static final int MAX = 9;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantity = scanner.nextInt();
        int[][] array = new int[quantity][quantity];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            System.out.println();
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
        }
    }
}
