package module22;

import java.util.Arrays;

public class Task18 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;


    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        getMaxValue(array);
        getMinValue(array);
    }

    public static void getMinValue(int[][] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                }
            }
        }
        System.out.println("The min value is " + minValue);
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] == minValue) {
                    System.out.println(Arrays.toString(new int[]{i, j}) + " ");
                }
            }
        }
    }

    public static void getMaxValue(int[][] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        System.out.println("The max value is " + maxValue);
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] == maxValue) {
                    System.out.println(Arrays.toString(new int[]{i, j}) + " ");
                }
            }
        }
    }

    public static void fillDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printDoubleArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
