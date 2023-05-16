package module15;

import java.util.Scanner;

public class Task23a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNumber = sc.nextInt();
        int temporaryOriginalNumber = originalNumber;
        while (temporaryOriginalNumber >= 10) {
            int number = temporaryOriginalNumber;
            int countOfDigits = 0;   // kolichestvo 0 posle pervoj cifri
            while (number >= 10) {
                number /= 10;
                countOfDigits++;
            }
            if (number % 2 == 0) {   //number = 1st digit in our number
                System.out.print(number + " ");
            }
            temporaryOriginalNumber = temporaryOriginalNumber - number * (int) Math.pow(10, countOfDigits);   //remove the 1st digit of the number
        }
        if (temporaryOriginalNumber % 2 == 0) {
            System.out.print(temporaryOriginalNumber + " ");
        }
        System.out.println();
        while (originalNumber >= 10) {
            int number = originalNumber;
            int countOfDigits = 0;
            while (number >= 10) {
                number /= 10;
                countOfDigits++;
            }
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
            originalNumber = originalNumber - number * (int) Math.pow(10, countOfDigits);   //remove the 1st digit of the number
        }
        if (originalNumber % 2 != 0) {
            System.out.print(originalNumber + " ");
        }
    }
}