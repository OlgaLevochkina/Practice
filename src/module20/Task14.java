package module20;

import static module17.Reader.readInputNumber;

public class Task14 {

    public static final int QUANTITY = 1;  // delala test na 5 data

    public static void main(String[] args) {
        int[] array = new int[QUANTITY];
        fillTheBirthdayData(array);
        printArray(array);
        System.out.println();
        int[] newArrayWithFilteredData = countMonths(array);
        System.out.println("Please find the info on how many birthdays each month below: ");
        printArray(newArrayWithFilteredData);
        System.out.println("The month with higher number of birthdays is " + getMonthWithHigherNumberOfBirthdays(newArrayWithFilteredData));

        getMonthWithoutBirthdays(newArrayWithFilteredData);

    }

    public static void fillTheBirthdayData(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter your date of birth: day , month, year");
            int day = readInputNumber();
            int month = readInputNumber();
            int year = readInputNumber();
            array[index] = month;
            index++;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }


    public static int[] countMonths(int[] array) {
        int[] newArray = new int[12];
        for (int i = 0; i < array.length; i++) {
            int index = array[i];
            newArray[index-1]++;
        }
        return newArray;
    }

    public static int getMonthWithHigherNumberOfBirthdays(int[] array) {
        int maxValue = 0;
        int maxElement = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxElement = i;
            }
        }
        return maxElement + 1;
    }

    public static void getMonthWithoutBirthdays(int[] array) {
        System.out.println("There is no birthdays in month(s) ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
