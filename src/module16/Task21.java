package module16;

import java.util.Scanner;

public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int digitsCount, sumOfDigits, modsCount, sumOfEverything = 0;
        while (number > 0) {
            modsCount = 0;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    modsCount++;
                }
                digitsCount = 0;
                sumOfDigits = 0;
                while (number > 0) {
                    digitsCount++;
                    sumOfDigits += number % 10;
                }
                System.out.println(digitsCount + " " + sumOfDigits + " " + modsCount);
                sumOfEverything += sumOfDigits;

            }
            number = sc.nextInt();
        }
        System.out.println(sumOfEverything);
    }
}
