package module11;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        int lastDigit = x % 10;
        System.out.println("Start");
        for (int i = 100 + lastDigit; i <= 990 + lastDigit; i += 10) {
            System.out.print(" " + i);
        }
        System.out.println("\nFinish");
    }
}
