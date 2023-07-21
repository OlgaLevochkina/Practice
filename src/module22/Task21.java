package module22;

public class Task21 {
    public static final int MIN = 1;
    public static final int MAX = 3;
    public static final int QUANTITY = 3;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        replaceWithDividers(array);
    }

    public static void replaceWithDividers(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                int dividers = getNumberOfDividers(array[i][j]);
                array[i][j] = dividers;
            }
        }
        printDoubleArray(array);
    }

    public static int getNumberOfDividers(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
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
