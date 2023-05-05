package module14;

public class Task7 {
    public static final int MIN = 10;
    public static final int MAX = 99;
    public static final int QUANTITY = 20;

    public static void main(String[] args) {
        int sumOfDigits = Integer.MIN_VALUE;
        int requiredNumber = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(number + " ");
            int firstDigit = number / 10;
            int lastDigit = number % 10;
            int sum = firstDigit + lastDigit;
            if (sum > sumOfDigits) {
                requiredNumber = number;
                sumOfDigits = sum;
            }
        }
        System.out.println();
        System.out.println("\nThe number is " + requiredNumber);
    }
}
