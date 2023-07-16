package module19;

import static module17.Reader.readInputNumber;

public class Task68 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
      //  int quantity = readInputNumber();
        int[] array = new int[]{0, 1, 1, 1, -1, 0};
     //   fillTheArray(array);
        printArray(array);
        System.out.println();
        int radius = readInputNumber();
        System.out.println(checkHowMany(array, radius));
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

    public static int checkHowMany(int[] array, int radius) {
        int count = 0;
        for (int i = 0; i < array.length; i += 2) {
            int x = array[i];
            int y = array[i + 1];
            if ((int) Math.pow(radius, 2) == (int) Math.pow(x, 2) + Math.pow(y, 2)) {
                count++;
            }
        }
        return count;
    }
}
