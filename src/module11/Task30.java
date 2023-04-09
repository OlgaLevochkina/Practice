package module11;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        for (int i = 10; i < 100; i++) {
            int firstDigit = i / 10;
            int lastDigit = i % 10;
            int multiplication = firstDigit * lastDigit;
            if (multiplication < x) {
                System.out.print(i + " ");
            }
        }
    }
}
