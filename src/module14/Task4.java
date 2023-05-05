package module14;

public class Task4 {
    public static final int MIN = -40;
    public static final int MAX = 40;
    public static final int QUANTITY = 50;

    public static void main(String[] args) {
        int minNumber = 0, maxNumber = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(newNumber + " ");
            if (newNumber < 0 && newNumber < minNumber) {
                minNumber = newNumber;
            }
            if (newNumber > 0 && newNumber > maxNumber) {
                maxNumber = newNumber;
            }
        }
        if (minNumber == 0) {
            System.out.println("\nError");
        } else {
            System.out.println("\nThe lowest number is " + minNumber);
        }
        if (maxNumber == 0) {
            System.out.println("Error");
        } else {
            System.out.println("The highest number is " + maxNumber);
        }
    }
}
