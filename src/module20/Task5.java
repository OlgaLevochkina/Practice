package module20;

public class Task5 {
    public static final int MIN = 1;
    public static final int MAX = 9;

    public static void main(String[] args) {
        int[] array = new int[100];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println("0: 1: 2: 3: 4: 5: 6: 7: 8: 9:");
        int[] newArray = countEveryDigit(array);
        printArray(newArray);
        System.out.println();
        System.out.println(getHighestValue(newArray));
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
            newArray[array[i]]++;
        }
        return newArray;

    }

    public static int getHighestValue(int[] array) {   // dodelat = neskolko mozhet bit
        int maxValue = 0;
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxElement = i;
            }
        }
        return maxElement;  // cifra kotoraq vstrechaetsa chashe vsego v 1om masive
    }
}
