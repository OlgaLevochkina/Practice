package module20;

public class Task9 {
    public static final int MIN = 10;
    public static final int MAX = 99;
    public static final int QUANTITY = 200;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = countDigits(array);
        printArray(newArray);
        System.out.println();
        findMaxQuantityOfDigits(newArray);
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

    public static int[] countDigits(int[] array) {
        int[] newArray = new int[10];
        for (int i = 0; i < array.length; i++) {
            int firstDigit = array[i] / 10;
            int lastDigit = array[i] % 10;
            newArray[firstDigit]++;
            newArray[lastDigit]++;
        }
        return newArray;
    }

    public static void findMaxQuantityOfDigits(int[] newArray) {
        int max = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] > max) {
                max = newArray[i];
            }
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == max) {
                System.out.println(i + " ");
            }
        }
    }
}
