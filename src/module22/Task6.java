package module22;

public class Task6 {
    public static final int MIN = 10;
    public static final int MAX = 99;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            int value = MIN + (int) ((MAX - MIN + 1) * Math.random());
            for (int j = 0; j < QUANTITY; j++) {
                array[i][j] = value;
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
