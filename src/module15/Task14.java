package module15;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int sum = 0;
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            number = numberWithoutLastDigit;
            sum += lastDigit;
        }
        sum += number;
        System.out.println("The sum of the digits is " + sum);
    }
}
