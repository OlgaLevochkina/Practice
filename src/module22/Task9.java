package module22;

import java.util.Scanner;

public class Task9 {

    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[][] array = new int[QUANTITY][QUANTITY];
        fillArray(array);
        printArray(array);
        System.out.println();
        System.out.println(countRequestedNumber(array, number));
    }

    public static int countRequestedNumber(int[][] array, int number) {
        int count = 0;
        for (int[] ints : array) {
            for (int j = 0; j < QUANTITY; j++) {
                if (ints[j] == number) {
                    count++;
                }
            }
        }
        return count;
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
