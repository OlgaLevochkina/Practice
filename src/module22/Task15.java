package module22;

public class Task15 {
    public static final int MIN = 1;
    public static final int MAX = 9;
    public static final int QUANTITY = 4;


    public static void main(String[] args) {
        int[][] array = new int[QUANTITY][QUANTITY];
        fillDoubleArray(array);
        printDoubleArray(array);
        System.out.println();
        int[] evenNumbers = getAllEvenNumbers(array);
        printSingleArray(evenNumbers);

    }

    public static int[] getAllEvenNumbers(int[][] array) {
        int[] evenNumber = new int[QUANTITY * 2];
        int count = 0;
        int index = 0;
        for (int i = 0; i < QUANTITY; i++) {
            for (int j = 0; j < QUANTITY; j++) {
                if (array[i][j] % 2 == 0) {
                    count++;
                    evenNumber[index] = array[i][j];
                    index++;

                }
            }
        }
        return evenNumber;
    }

    public static void printSingleArray(int[] array) {
        for (int value : array) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
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
