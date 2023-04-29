package module13;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        if (sum % 2 == 0 && number % 2 == 0) {
            System.out.println("The number is twice even");
        } else {
            System.out.println("The number is ordinary");
        }
    }
}
