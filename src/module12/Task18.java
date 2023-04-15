package module12;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int count = 0;
        int quantity = Math.max(firstNumber, secondNumber);
        for (int i = 1; i <= quantity / 2; i++) {
            if (firstNumber % i == 0 && secondNumber % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
