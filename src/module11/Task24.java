package module11;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("Start");
        int firstNumber = 0;
        int distanceBetweenNumbers = 8;
        for (int i = 0; i < 2 * x; i++) {
            System.out.print(firstNumber - distanceBetweenNumbers * i + " ");
        }
        System.out.println("\nFinish");
    }
}

