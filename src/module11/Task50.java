package module11;

import java.util.Scanner;

public class Task50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = scanner.nextInt();
        int firstDigitOfX = x / 10;
        int lastDigitofX = x % 10;
        int sumX = firstDigitOfX + lastDigitofX;
        for (int fourDigitNumber = 1000; fourDigitNumber < 10000; fourDigitNumber++) {
            int firstDigit = fourDigitNumber / 1000;
            int fourDigitNumberWithoutThousands = fourDigitNumber - firstDigit * 1000;
            int secondDigit = fourDigitNumberWithoutThousands / 100;
            int thirdDigit = fourDigitNumberWithoutThousands / 10 % 10;
            int lastDigit = fourDigitNumberWithoutThousands % 10;
            int sumOfFirstTwoDigits = firstDigit + secondDigit;
            int sumOfSecondTwoDigits = thirdDigit + lastDigit;
            if (sumX == sumOfFirstTwoDigits && sumOfSecondTwoDigits == sumX) {
                System.out.print(fourDigitNumber + " ");
            }
        }
    }
}
