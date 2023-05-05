package module14;

public class Task10 {
    public static final int MIN = 100;
    public static final int MAX = 999;
    public static final int QUANTITY = 25;

    public static void main(String[] args) {
        int maxNumber = 0, position = 1;
        int highestSum = 0;
        for (int i = 0; i < QUANTITY; i++) {
            int number = MIN + (int) ((MAX - MIN + 1) * Math.random());
            System.out.print(number + " ");
            int firstDigit = number / 10;
            int secondDigit = number / 10 % 10;
            int lastDigit = number % 10;
            int sum = firstDigit + secondDigit + lastDigit;
            if (sum > highestSum) {
                maxNumber = number;
                highestSum = sum;
                position = i + 1;
            }
        }
        System.out.println("\nThe highest number is " + maxNumber);
        System.out.println("It is under " + position + " number");
    }
}

