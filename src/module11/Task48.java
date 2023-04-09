package module11;

import java.util.Scanner;

public class Task48 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        for (int i = 100; i < 1000; i++) {
            int firstTwoDigits = i / 10;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int lastTwoDigits = secondDigit * 10 + lastDigit;
            if (x == firstTwoDigits || x == lastTwoDigits) {
                System.out.print(i + " ");
            }
        }
    }
}
