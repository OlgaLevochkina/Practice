package module8;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstPart number");
        int number = sc.nextInt();
        int firstPart = 0, reversedLastPart = 0;
        if (number < 100) {
            firstPart = number / 10;
            reversedLastPart = number % 10;
        } else if (number < 1000) {
            firstPart = number / 100;
            reversedLastPart = number % 10;
        } else if (number < 10000) {
            firstPart = number / 100;
            int lastPart = number - firstPart * 100;
            reversedLastPart = lastPart % 10 * 10 + lastPart / 10;
        } else if (number < 100000) {
            firstPart = number / 1000;
            int lastPart = number - number / 100 * 100;
            reversedLastPart = lastPart % 10 * 10 + lastPart / 10;
        }
        if (firstPart == reversedLastPart || number < 10) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }

    public static void task26a() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int reversedNumber = 0;
        int firstDigit, a, b, secondDigit, thirdDigit, fourthDigit, lastDigit;
        if (number < 100) {
            reversedNumber = number % 10 * 10 + number / 10;
        } else if (number < 1000) {
            reversedNumber = number % 10 * 100 + number / 10 % 10 * 10 + number / 100;
        } else if (number < 10000) {
            firstDigit = number / 1000;
            a = number - firstDigit * 1000;
            secondDigit = a / 100;
            thirdDigit = a / 10 % 10;
            lastDigit = a % 10;
            reversedNumber = lastDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;
        } else if (number < 100000) {
            firstDigit = number / 10000;
            a = number - firstDigit * 10000;
            secondDigit = a / 1000;
            b = a - secondDigit * 1000;
            thirdDigit = b / 100;
            fourthDigit = b / 10 % 10;
            lastDigit = b % 10;
            reversedNumber = lastDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit;
        }
        if (number == reversedNumber || number < 10) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not");
        }
    }
}
