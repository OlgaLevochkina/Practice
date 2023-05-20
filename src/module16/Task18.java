package module16;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                int count = 0;
                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
}
