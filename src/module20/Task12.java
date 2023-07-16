package module20;

public class Task12 {
    public static final int MIN = 0;
    public static final int MAX = 1000;
    public static final int QUANTITY = 4;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArrayWithSum = new int[4];
        calculateSum(array, newArrayWithSum);
        printArray(newArrayWithSum);


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

    public static int[] calculateSum(int[] array, int[] newArray) {

            for (int j = 0; j < array.length; j++) {
                newArray[0] += array[j] / 1000;
                newArray[1] += (array[j] / 100) % 10;
                newArray[2] += (array[j] / 10) % 10;
                newArray[3] += array[j] % 10;
            }

        return newArray;
    }
}
