package module22;

import java.util.Scanner;

public class Task11 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int line = scanner.nextInt();
        int[][] array = new int[QUANTITY][QUANTITY];
        fillArray(array);
        printArray(array);
        System.out.println();
        System.out.println(calculateSum(array, line));
        System.out.println();
        calculateSumOfAllRows(array);

    }

    public static int calculateSum(int[][] array, int row) {
        int sum = 0;
        for (int j = 0; j < QUANTITY; j++) {
            sum += array[row][j];
        }
        return sum;
    }

    public static void calculateSumOfAllRows(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            System.out.println(calculateSum(array, i) + " ");
        }
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < QUANTITY; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
