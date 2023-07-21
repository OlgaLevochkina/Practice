package module22;

public class Task5 {

    public static final int MIN = 30;
    public static final int MAX = 125;
    public static final int FIRST_QUANTITY = 6;
    public static final int SECOND_QUANTITY = 14;

    public static void main(String[] args) {
        int[][] array = new int[FIRST_QUANTITY][SECOND_QUANTITY];
        fillArray(array);
        printArray(array);
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < FIRST_QUANTITY; i++) {
            for (int j = 0; j < SECOND_QUANTITY; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] ints : array) {
            for (int j = 0; j < SECOND_QUANTITY; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
