package module15;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int sum = 0, count = 0;
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            if (lastDigit % 2 == 0) {
                count++;
                sum += lastDigit;
            }
            number = numberWithoutLastDigit;
        }
        if (number % 2 == 0) {
            sum += number;
            count++;
        }
        System.out.println("The number of even digits is " + count);
        System.out.println("Its sum is " + sum);
    }
}
