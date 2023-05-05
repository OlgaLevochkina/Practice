package module14;

public class Task5 {
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int QUANTITY = 12;

    public static void main(String[] args) {
        int averageScore;
        int minNumber = Integer.MAX_VALUE, maxNumber = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(newNumber + " ");
            if (newNumber < minNumber) {
                minNumber = newNumber;
            } else if (newNumber > maxNumber) {
                maxNumber = newNumber;
            }
        }
        System.out.println("\nThe lowest number is " + minNumber);
        System.out.println("The highest number is " + maxNumber);
        averageScore = (minNumber + maxNumber) / 2;
        System.out.println("The average score is " + averageScore);
    }
}
