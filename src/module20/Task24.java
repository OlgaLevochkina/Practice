package module20;

public class Task24 {
    public static final int MIN = 1;
    public static final int MAX = 10;
    public static final int QUANTITY = 7;

    public static void main(String[] args) {
        //   int quantity = readInputNumber();
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = getUniqueValues(array);
        printArray(newArray);

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

    public static int[] getUniqueValues(int[] array) {
        int[] newArray = new int[7];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < newArray.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}

