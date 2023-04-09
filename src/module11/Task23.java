package module11;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = scanner.nextInt();
        System.out.println("Start");
        int firstNumber = 7;
        int distanceBetweenNumbers = 4;
        for (int i = 0; i < x; i++) {
            System.out.print(firstNumber + distanceBetweenNumbers * i + " ");
        }
        System.out.println("\nFinish");
    }
}
