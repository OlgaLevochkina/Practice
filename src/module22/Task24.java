package module22;

public class Task24 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY_ONE = 4;
    public static final int QUANTITY_TWO = 5;

    public static void main(String[] args) {
        int[][] arrayOne = new int[QUANTITY_TWO][QUANTITY_ONE];
        fillDoubleArray(arrayOne);
        printDoubleArray(arrayOne);
        System.out.println();
        int[][] arrayTwo = new int[QUANTITY_TWO][QUANTITY_ONE];
        fillDoubleArray(arrayTwo);
        printDoubleArray(arrayTwo);
        compareLengthOfDoubleArrays(arrayOne, arrayTwo);

    }

    public static void compareLengthOfDoubleArrays(int[][] arrayOne, int[][] arrayTwo) {
        if (arrayOne.length == arrayTwo.length && arrayOne[0].length == arrayTwo[0].length) {
            System.out.println("Both arrays have same size & structure");
        } else {
            System.out.println("Arrays have different size & structure");
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
