package module13;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int sum = 0;
        int minNumber = Math.min(firstNumber, secondNumber);
        for (int i = 1; i <= minNumber; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nThe sum of common dividers is " + sum);
    }
}
