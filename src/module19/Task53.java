package module19;

import static module17.Reader.readInputNumber;

public class Task53 {
    public static final int MIN = 10;
    public static final int MAX = 100;

    public static void main(String[] args) {
        int arrayQuantity = readInputNumber();
        int[] array = new int[arrayQuantity];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = buildNewArray2(array);
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

    private static int findEvenElements(int[] array) {
        int countEvenElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEvenElements++;
            }
        }
        return countEvenElements;
    }

//    private static int[] buildNewArray(int[] array) {
//        LocalDateTime start = LocalDateTime.now();
//        System.out.println(start);
//        int countEvenElements = findEvenElements(array);
//        int[] newArray = new int[array.length];
//        for (int j = 0; j < countEvenElements; j++) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 == 0) {
//                    newArray[j] = array[i];
//                    j++;
//                }
//            }
//        }
//        for (int j = countEvenElements; j < newArray.length; j++) {
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] % 2 != 0) {
//                    newArray[j] = array[i];
//                    j++;
//                }
//            }
//        }
//        LocalDateTime end = LocalDateTime.now();
//        System.out.println(end.getSecond() - start.getSecond());
//        return newArray;
//    }

    private static int[] buildNewArray2(int[] array) {
        int countEvenElements = findEvenElements(array);
        int[] newArray = new int[array.length];
        int indexStart = 0;
        int indexEnd = countEvenElements;
        for (int value : array) {
            if (value % 2 == 0) {
                newArray[indexStart] = value;
                indexStart++;
            } else {
                newArray[indexEnd] = value;
                indexEnd++;
            }
        }
        return newArray;
    }
}
