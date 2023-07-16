package module19;

public class Task67 {
    public static final int MIN = 1;
    public static final int MAX = 10;

    public static void main(String[] args) {
        //    int quantity = readInputNumber();
        int[] array = new int[]{4, 3, 1, 3, 1, 3, 4, 3, 6, 2, 1, 3};
        //      fillTheArray(array);
        printArray(array);
        System.out.println();
        System.out.println(findRequiredPoint(array));
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

    private static int calculateDistance(int x, int y) {
        return (int) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static int findRequiredPoint(int[] array) {
        int maxDistance = 0;
        int pointNumber = 0;
        for (int i = 0; i < array.length; i += 2) {
            int x = array[i];
            int y = array[i + 1];
            int distance = calculateDistance(x, y);
            if (distance > maxDistance) {
                maxDistance = distance;
                pointNumber = i / 2 + 1;
            }
        }
        return pointNumber;
    }
}
