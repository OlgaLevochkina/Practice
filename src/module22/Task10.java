package module22;

public class Task10 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 5;

    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillArray(array);
        printArray(array);
        System.out.println();
        System.out.println(calculateSum(array));
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            for (int j = 0; j < QUANTITY; j++) {
                sum += ints[j];
            }
        }
        return sum;
    }

    public static void fillArray(int[][] array) {
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                array[i][j] = MIN + (int) ((MAX - MIN + 1) * Math.random());
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
