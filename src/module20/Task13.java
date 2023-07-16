package module20;

public class Task13 {
    public static final int MIN = 1;
    public static final int MAX = 6;
    public static final int QUANTITY = 1000;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = countEveryDigit(array);
        printArray(newArray);
        getHighestValue(newArray);


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
        int[] newArray = new int[6];
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            newArray[index-1]++;
        }
        return newArray;
    }


    public static void getHighestValue(int[] array) {
        System.out.println("It is proven statistically that some numbers can show up more frequently than other numbers, for e.g.: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 100) {
                System.out.println(i + 1 + " ");
            }
        }
    }
}
