package module22;

public class Task19 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        getSumOfTheDiagonal(array);
    }

    public static void getSumOfTheDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (i == j) {
                    sum += array[i][j];
                }
            }
        }
        System.out.println("The sum of the diagonal is " + sum);
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
