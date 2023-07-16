package module20;

public class Task21 {
    public static void main(String[] args) {
        int days = 7;
        int min = 1;
        int max = 10;
        int quantity = 10;
        int[] array = new int[quantity];
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < max; j++) {
                int dailyIncome = min + (int) ((max - min + 1) * Math.random());
                array[j] += dailyIncome;
            }
        }
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
}
