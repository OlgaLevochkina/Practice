package module20;


public class Task3 {
    public static final int MIN = 0;
    public static final int MAX = 9999;

    public static void main(String[] args) {
        int[] array = new int[2000];
        fillTheArray(array);
  //      printArray(array);
        System.out.println();
        System.out.println("Single digits, double digits, three-digits, four-digits numbers:");
        printArray(countAllValues(array));
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

    public static int[] countAllValues(int[] array) {
        int[] newArray = new int[4];
        int singleDigits = 0;
        int doubleDigits = 0;
        int threeDigits = 0;
        int fourDigits = 0;
        for (int value : array) {
            if (value < 10) {
                singleDigits++;
            } else if (value < 100) {
                doubleDigits++;
            } else if (value < 1000) {
                threeDigits++;
            } else {
                fourDigits++;
            }
        }
        newArray[0] = singleDigits;
        newArray[1] = doubleDigits;
        newArray[2] = threeDigits;
        newArray[3] = fourDigits;
        return newArray;
    }
}
