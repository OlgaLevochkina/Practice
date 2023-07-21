package module22;

public class Task17 {

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
        int count = 0;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] < minValue) {
                    minValue = array[i][j];
                }
            }
        }
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] == minValue) {
                    count++;
                }

            }
        }
        System.out.println("The min value is " + minValue + " and its quantity is " + count);
    }


    public static void getMaxValue(int[][] array) {
        int maxValue = 0;
        int count = 0;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] > maxValue) {
                    maxValue = array[i][j];
                }
            }
        }
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] == maxValue) {
                    count++;
                }

            }
        }
        System.out.println("The max value is " + maxValue + " and its quantity is " + count);
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
