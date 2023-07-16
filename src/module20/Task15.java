package module20;

public class Task15 {
    public static final int MIN = 1;
    public static final int MAX = 5;
    public static final int QUANTITY = 150;

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillTheArray(array);
        printArray(array);
        System.out.println();
        int[] newArray = countGrades(array);
        printArray(newArray);
        System.out.println();
        showResults(newArray);
        countGradesThatNobodyReceived(newArray);

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

    public static int[] countGrades(int[] array) {
        int[] newArray = new int[5];
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            newArray[index - 1]++;
        }
        return newArray;
    }

    private static void showResults(int[] newArray) {
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("the number of students who received " + (i + 1) + " grade is " + newArray[i]);
        }
    }

    public static void countGradesThatNobodyReceived(int[] array) {
        System.out.println("Nobody received the following grades ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println((i + 1) + " ");
            }
        }
    }
}
