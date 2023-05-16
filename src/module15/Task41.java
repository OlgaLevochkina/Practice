package module15;

import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int higherNumber = Math.max(numberA, numberB);
        int lowerNumber = Math.min(numberA, numberB);
        int count = 0;
        while (higherNumber > lowerNumber) {
            count++;
            if (higherNumber % 2 == 0) {
                higherNumber = higherNumber / 2;
            } else {
                higherNumber--;
            }
            System.out.println(higherNumber);
        }
        System.out.println("Quantity - " + count);
    }
}
