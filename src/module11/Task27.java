package module11;

import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int number = 10;
        for (int i = 10; i < 100; i++) {
            int firstDigit = number / 10;
            int lastDigit = number % 10;
            int sum = firstDigit + lastDigit;
            if (sum == x) {
                System.out.print(number + " ");
            }
            number++;
        }
    }
}
