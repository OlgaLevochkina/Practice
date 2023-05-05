package module14;

public class Task6 {
    public static final int MIN = 1;
    public static final int MAX = 100;
    public static final int QUANTITY = 27;

    public static void main(String[] args) {
        int averageScoreOfTwoNumbers, totalSum = 0;
        int averageScoreOfAllNumbers;
        int minNumber = Integer.MAX_VALUE, maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < QUANTITY; i++) {
            int newNumber = MIN + (int) ((MAX - MIN + 1) * Math.random());
            totalSum += newNumber;
            System.out.print(newNumber + " ");
            if (newNumber < minNumber) {
                minNumber = newNumber;
            }
            if (newNumber > maxNumber) {
                maxNumber = newNumber;
            }
        }
        System.out.println("\nThe lowest number is " + minNumber);
        System.out.println("The highest number is " + maxNumber);
        averageScoreOfTwoNumbers = (minNumber + maxNumber) / 2;
        averageScoreOfAllNumbers = totalSum / QUANTITY;
        System.out.println("The average score of the highest and lowest numbers is " + averageScoreOfTwoNumbers);
        System.out.println("The average score of all numbers is " + averageScoreOfAllNumbers);
    }
}