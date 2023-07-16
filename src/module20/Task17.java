package module20;

public class Task17 {
    public static final int QUANTITY = 1200;
    public static final int MALE = 0;
    public static final int FEMALE = 1;
    public static final int MIN_MONTH = 1;
    public static final int MAX_MONTH = 12;

    public static void main(String[] args) {
        int[] arrayMonths = new int[QUANTITY];
        int[] arrayGender = new int[QUANTITY];
        fillArrayWithMonthsData(arrayMonths);
        printArray(arrayMonths);
        System.out.println();
        fillArrayWithGenderData(arrayGender);
        printArray(arrayGender);
        System.out.println();
        int[] arrayWithFemaleBirthdays = fillArrayWithFemaleBirthdays(arrayGender, arrayMonths);
        printArray(arrayWithFemaleBirthdays);
        System.out.println();
        int[] arrayWithMaleBirthdays = fillArrayWithMaleBirthdays(arrayGender, arrayMonths);
        printArray(arrayWithMaleBirthdays);
        System.out.println();
        printStatistics(arrayWithFemaleBirthdays, arrayWithMaleBirthdays);


    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

    public static void fillArrayWithMonthsData(int[] arrayMonths) {
        for (int i = 0; i < arrayMonths.length; i++) {
            arrayMonths[i] = MIN_MONTH + (int) ((MAX_MONTH - MIN_MONTH + 1) * Math.random());
        }
    }

    public static void fillArrayWithGenderData(int[] arrayGender) {
        for (int i = 0; i < arrayGender.length; i++) {
            arrayGender[i] = MALE + (int) ((FEMALE - MALE + 1) * Math.random());
        }
    }

    public static int[] fillArrayWithFemaleBirthdays(int[] arrayGender, int[] arrayMonths) {
        int[] arrayWithFemaleBirthdays = new int[12];
        for (int i = 0; i < arrayGender.length; i++) {
            if (arrayGender[i] == 1) {
                arrayWithFemaleBirthdays[arrayMonths[i] - 1]++;
            }
        }
        return arrayWithFemaleBirthdays;
    }

    public static int[] fillArrayWithMaleBirthdays(int[] arrayGender, int[] arrayMonths) {
        int[] arrayWithMaleBirthdays = new int[12];
        for (int i = 0; i < arrayGender.length; i++) {
            if (arrayGender[i] == 0) {
                arrayWithMaleBirthdays[arrayMonths[i] - 1]++;
            }
        }
        return arrayWithMaleBirthdays;
    }

    public static void printStatistics(int[] arrayWithFemaleBirthdays, int[] arrayWithMaleBirthdays) {
        for (int i = 0; i < arrayWithFemaleBirthdays.length; i++) {
            System.out.println("The number of students born in " + (i + 1) + " month:");
            System.out.println(arrayWithFemaleBirthdays[i] + arrayWithMaleBirthdays[i]);
            if (arrayWithFemaleBirthdays[i] > arrayWithMaleBirthdays[i]) {
                System.out.println("More female students than male");
            }
        }
    }
}
