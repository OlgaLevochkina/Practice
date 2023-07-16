package module19;

public class Task66 {

    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //    int quantity = readInputNumber();
          int[] array = new int[]{4, 3, 6, 2, 1, 3, 1};   // true
 //       int[] array = new int[]{4, 3, 1, 2, 4, 2, 3};   // false
        //      fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(checkIfCondIsMet(array));

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

    public static boolean checkIfCondIsMet(int[] array) {
        boolean isMet = false;
        for (int i = 0; i < array.length; i++) {
            int secondIndex = array[i] + i + 1;
            if (secondIndex < array.length && array[i] == array[secondIndex]) {
                isMet = true;
                break;
            }
        }
        return isMet;
    }
}
