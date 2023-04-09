package module11;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int max = Math.max(firstNumber, secondNumber);
        int min = Math.min(firstNumber, secondNumber);
        for (int i = 0; i < 20; i++) {
            int randomNumber = max - (int) ((max - min + 1) * Math.random());
            System.out.println(randomNumber);
        }
    }
}
