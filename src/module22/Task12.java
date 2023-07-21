package module22;

import java.util.Scanner;

// ne uverena

public class Task12 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number 0 - 4");
        int column = scanner.nextInt();
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        System.out.println(calculateSumOfParticularColumn(array, column));
        System.out.println();
        calculateMaxSumAmongAllColumns(array);
    }

    public static int calculateSumOfParticularColumn(int[][] array, int column) {
        int sum = 0;
        for (int i = 0; i < QUANTITY; i++) {
            sum += array[i][column];
        }
        return sum;
    }

    public static void calculateMaxSumAmongAllColumns(int[][] array) {
        int maxSum = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int sumOfTheColumn = calculateSumOfParticularColumn(array, i);
            if (sumOfTheColumn > maxSum) {
                maxSum = sumOfTheColumn;
            }
        }
        System.out.println(maxSum);
    }

    public static void fillDoubleArray(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printDoubleArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < QUANTITY; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
