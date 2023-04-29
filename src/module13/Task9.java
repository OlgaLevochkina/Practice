package module13;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int i, sum = 0;
        int minNumber = Math.min(numberOne, numberTwo);
        for (i = 1; i <= minNumber; i++) {
            if (numberOne % i == 0 && numberTwo % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        if (sum % 2 == 0) {
            System.out.println("\nEven-related");
        } else {
            System.out.println("Not even-related");
        }
    }
}
