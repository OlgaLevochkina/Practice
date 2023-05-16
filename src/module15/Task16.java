package module15;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int sumOfUnevenNumbers = 0, countOfEvenNumbers = 0;
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            if (lastDigit % 2 == 0) {
                countOfEvenNumbers++;
            } else {
                sumOfUnevenNumbers += lastDigit;
            }
            number = numberWithoutLastDigit;
        }
        if (number % 2 == 0) {
            countOfEvenNumbers++;
        } else {
            sumOfUnevenNumbers += number;
        }
        System.out.println("The number of even digits is  " + countOfEvenNumbers);
        System.out.println("The sum of uneven digits is " + sumOfUnevenNumbers);
    }
}
