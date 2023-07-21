package module22;

public class Task14 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        int[] arraySum = getSumOfAllRows(array);
        printSingleArray(arraySum);
    }

    public static int[] getSumOfAllRows(int[][] array) {
        int[] arraySum = new int[QUANTITY];
        for (int i = 0; i < QUANTITY; i++) {
            int sum = 0;
            for (int j = 0; j < QUANTITY; j++) {
                sum += array[i][j];
            }
            arraySum[i] = sum;
        }
        return arraySum;
    }

    public static void printSingleArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printDoubleArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
