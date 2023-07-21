package module22;

public class Task22 {

    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        int[] init = getArray(5);
        int[][] array = getValueWithDividersArray(init);
        printDoubleArray(array);
    }

    private static int[][] getValueWithDividersArray(int[] init) {
        int[][] array = new int[init.length][getMaxDividers(init) + 1];
        fillArray(array, init);

        return array;
    }

    private static void fillArray(int[][] array, int[] init) {
        for (int i = 0; i < array.length; i++) {
            array[i][0] = init[i];
            int[] dividers = getDividersArray(init[i], array[0].length);
            for (int j = 1; j < dividers.length; j++) {
                array[i][j] = dividers[j];
            }
        }
    }

    private static int[] getDividersArray(int value, int length) {
        int[] dividers = new int[length];
        int index = 1;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                dividers[index] = i;
                index++;
            }
        }

        return dividers;
    }

    private static int[] getArray(int size) {
        int[] init = new int[size];
        for (int i = 0; i < size; i++) {
            init[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        return init;
    }

    private static int getMaxDividers(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int value : array) {
            int count = getCountOfDividers(value);
            if (count > max) {
                max = count;
            }
        }
        return max;
    }

    private static int getCountOfDividers(int value) {
        int count = 0;
        for (int i = 1; i <= value; i++) {
            if (value % i == 0) {
                count++;
            }
        }
        return count;
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
