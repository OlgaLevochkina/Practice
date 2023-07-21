package module22;

import java.util.Scanner;

public class Task8 {

    public static final int MIN = 1;
    public static final int MAX = 10;
    public static final int ROWS = 3;
    public static final int COLUMNS = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[ROWS][COLUMNS];
        fillArray(array);
        printArray(array);
        System.out.println();
        replaceWithZero(array, number);
        printArray(array);
    }

    public static void replaceWithZero(int[][] array, int number) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                if (array[i][j] != number) {
                    array[i][j] = 0;
                }
            }
        }
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
