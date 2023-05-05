package module14;

public class Task8 {
    public static final int MIN = 100;
    public static final int MAX = 999;
    public static final int QUANTITY = 15;

    public static void main(String[] args) {
        int minNumber = Integer.MAX_VALUE;
        int requiredNumber = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(number + " ");
            int firstDigit = number / 100;
            int secondDigit = number / 10 % 10;
            int lastDigit = number % 10;
            int sum = firstDigit + secondDigit + lastDigit;
            if (sum < minNumber) {
                minNumber = sum;
                requiredNumber = number;
            }
        }
        System.out.println();
        System.out.println(requiredNumber);
    }
}
