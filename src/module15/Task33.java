package module15;

import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int digit = scanner.nextInt();
        int number = 0, degree = 1;
        while (number < 1000) {
            number = (int) Math.pow(digit, degree);
            if (number < 1000) {
                System.out.println(number);
            }
            degree++;
        }
    }
}
