package module11;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        for (int i = 100; i < 1000; i++) {
            int firstDigit = i / 100;
            int secondDigit = i / 10 % 10;
            int lastDigit = i % 10;
            int sum = firstDigit + secondDigit + lastDigit;
            if (sum == x) {
                System.out.print(i + " ");
            }
        }
    }
}
