package module15;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        long number = scanner.nextLong();
        while (number > 10) {
            int sum = 0;
            while (number >= 10) {
                long numberWithoutLastDigit = number / 10;
                long lastDigit = number - numberWithoutLastDigit * 10;
                sum += lastDigit;
                number = numberWithoutLastDigit;
            }
            sum += number;
            System.out.println(sum);
            number = sum;
        }
    }
}
