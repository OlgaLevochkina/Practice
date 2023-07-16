package module20;

public class Task10 {
    public static final int MIN = 100;
    public static final int MAX = 999;
    public static final int QUANTITY = 5000;

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = countEveryDigit(array);
        printArray(newArray);
        System.out.println();
        findMinQuantityOfDigits(newArray);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    private static void fillTheArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = MIN + (int) ((MAX - MIN + 1) * Math.random());
        }
    }

    public static int[] countEveryDigit(int[] array) {
        int[] newArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            int firstDigit = array[i] / 100;
            int secondDigit = array[i] / 10 % 10;
            int lastDigit = array[i] % 10;
            newArray[firstDigit]++;
            newArray[secondDigit]++;
            newArray[lastDigit]++;
        }
        return newArray;
    }

    public static void findMinQuantityOfDigits(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.println(i + " ");
            }
        }
    }
}
