package module16;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            System.out.print(i + ": ");
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
