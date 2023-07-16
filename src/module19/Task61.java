package module19;

import static module17.Reader.readInputNumber;

public class Task61 {
    public static final int MIN = 1;
    public static final int MAX = 5;

    public static void main(String[] args) {
        int quantity = readInputNumber();
        int[] array = new int[quantity];
        fillTheArray(array);
        printArray(array);

        System.out.println();
        int[] newArray = buildArrayWithoutDuplicates(array);
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

//    public static int countUniqueElements(int[] array) {
//        int count = 0;
//        for (int i = 1; i < array.length; i++) {
//            for (int k : array) {
//                if (array[i] == k) {
//                    count++;
//                }
//            }
//        }
//        return count;
//    }

    public static int[] buildArrayWithoutDuplicates(int[] array) {
        int[] tempArray = new int[array.length];
        int index = 0;
        for (int i : array) {
            boolean isUnique = true;
            for (int j = 0; j < index; j++) {
                if (i == j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempArray[index] = i;
                index++;
            }
        }

        int[] newArray = new int[index];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = tempArray[i];
        }
        return newArray;
    }
}
