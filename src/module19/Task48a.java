package module19;

public class Task48a {

    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //  int arrayQuantity = readInputNumber();
        int[] arrayOne = new int[]{7, 4, 3, 1};    // smaller
        int[] arrayTwo = new int[]{7, 3, 4, 9, 8};   // bigger
        // fillTheArray(arrayOne);
        printArray(arrayOne);
        System.out.println();
        //fillTheArray(arrayTwo);
        printArray(arrayTwo);
        System.out.println();
        System.out.println(checkIfThere(arrayOne, arrayTwo));


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

    public static boolean checkIfThere(int[] arrayOne, int[] arrayTwo) {
        boolean stop = false;
        for (int value : arrayOne) {
            stop = true;
            for (int valueTwo : arrayTwo) {
                if (value == valueTwo) {
                    stop = false;
                    break;
                }
            }
            if (stop) {
                break;
            }
        }
        return !stop;
    }
}
