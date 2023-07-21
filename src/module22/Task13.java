package module22;

public class Task13 {

    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        getEqualArray(array);
        printDoubleArray(array);
    }

    public static void getEqualArray(int[][] array) {
        while (!calculateSum(array)) {
            fillDoubleArray(array);
        }
    }

    public static boolean calculateSum(int[][] array) {
        int sumExternal = 0;
        int sumInternal = 0;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (i == 0 || i == QUANTITY - 1 || j == 0 || j == QUANTITY - 1) {
                    sumExternal += array[i][j];
                } else {
                    sumInternal += array[i][j];
                }
            }
        }
        return sumExternal == sumInternal;
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
