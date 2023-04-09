package module11;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        for (int i = 0; i < 20; i++) {
            int randomNumber = secondNumber - (int) ((secondNumber - firstNumber + 1) * Math.random());
            System.out.println(randomNumber);
        }
    }
}
