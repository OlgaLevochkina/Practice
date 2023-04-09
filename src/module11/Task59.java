package module11;

import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        int count = Math.min(numberA, numberB);
        int start = Math.max(numberA, numberB);
        for (int i = 0; i < count; i++) {
            System.out.println(start + " ");
            start++;
        }
    }
}
