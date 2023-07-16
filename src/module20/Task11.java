package module20;

public class Task11 {
    public static final int MIN = 10;
    public static final int MAX = 99;
    public static final int QUANTITY = 50;

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        countEveryDigit(array);
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
//
//        for(
//    int i = 0;
//    i<newArray.length;i++)
//
//    {
//        if (newArray[i] == 0) {
//            System.out.println("The digit that have never been used is " + i);
//        }
//    }
//}
}
