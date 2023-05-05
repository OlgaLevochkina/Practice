package module14;

public class Task3 {
    public static final int MIN = -40;
    public static final int MAX = 40;
    public static final int QUANTITY = 50;

    public static void main(String[] args) {
        int maxNumber = -40;
        int minNumber = 40;
        for (int i = 0; i < QUANTITY; i++) {
            int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(newNumber + " ");
            if (newNumber < minNumber) {
                minNumber = newNumber;
            } if (newNumber > maxNumber) {
                maxNumber = newNumber;
            }
        }
        System.out.println("\nThe lowest number is " + minNumber);
        System.out.println("The highest number is " + maxNumber);
    }
}
