package module11;

import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int higherNumber = Math.max(firstNumber, secondNumber);
        int lowerNumber = Math.min(firstNumber, secondNumber);
        for (int i = lowerNumber + 1; i < higherNumber; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "+");
            }
        }
    }
}
