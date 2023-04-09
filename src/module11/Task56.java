package module11;

import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int higherNumber = Math.max(firstNumber, secondNumber);
        int lowerNumber = Math.min(firstNumber, secondNumber);
        for (int i = lowerNumber; i <= higherNumber; i++) {
            System.out.print(i + " ");
        }
    }
}
