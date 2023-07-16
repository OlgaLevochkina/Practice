package module20;

public class Task8 {
    public static final int MIN = 15;
    public static final int MAX = 45;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[20];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        showMissingElements(array);

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



    public static void showMissingElements(int[] array) {
        for (int i = 15; i < 45; i++) {
            if (isElementMissing(array, i)) {   // tolko esli true = vidast i; esli boolean method false = togda nichego ne budet
                System.out.println(i);
            }
        }
    }

    public static boolean isElementMissing(int[] array, int value) {
        boolean isMissing = true;
        for (int v : array) {
            if (v == value) {
                isMissing = false;
                break;
            }
        }
        return isMissing;
    }
}
