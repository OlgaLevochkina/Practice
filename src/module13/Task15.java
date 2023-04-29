package module13;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int firstDigit = number / 10;
        int lastDigit = number % 10;
        int sum = 0;
        int maxNumber = Math.max(firstDigit, lastDigit);
        int minNumber = Math.min(firstDigit, lastDigit);
        for (int i = minNumber; i <= maxNumber; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum is " + sum);
    }
}