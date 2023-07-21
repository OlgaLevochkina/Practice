package module22;

public class Task25 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 3;


    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        int row = 1;
        System.out.println(checkIfIncreasing(array, row));
    }


    public static boolean checkIfIncreasing(int[][] array, int row) {
        int prev = array[row][0];
        boolean flag = true;
        for (int j = 1; j < QUANTITY; j++) {
            if (array[row][j] < prev) {
                flag = false;
                break;
            } else {
                prev = array[row][j];
            }
        }
        return flag;
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
