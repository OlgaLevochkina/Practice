package module13;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            System.out.print(i + " ");
            if (i > 0) {
                sum = sum + i;
            }
        }
        System.out.println("\nThe sum is " + sum);
    }
}
