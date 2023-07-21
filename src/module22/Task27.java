package module22;

public class Task27 {
    public static final int MIN = 1;
    public static final int MAX = 2;
    public static final int QUANTITY_ONE = 4;
    public static final int QUANTITY_TWO = 2;

    public static void main(String[] args) {
        int[][] arrayOne = new int[QUANTITY_ONE][QUANTITY_ONE];
        fillDoubleArray(arrayOne);
        printDoubleArray(arrayOne);
        System.out.println();
        int[][] arrayTwo = new int[QUANTITY_TWO][QUANTITY_TWO];
        fillDoubleArray(arrayTwo);
        printDoubleArray(arrayTwo);
        System.out.println(compareDoubleArrays(arrayOne, arrayTwo));

    }

    public static boolean compareDoubleArrays(int[][] arrayOne, int[][] arrayTwo) {
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[0].length; i++) {
                if (arrayOne[i][j] != arrayTwo[i][j]) {
                    return false;
                }
            }
        }
        return true;
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
