package module13;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum = sum + i;
            }
        }
        System.out.println();
        if (sum == number) {
            System.out.println("\nThis number is amazing");
        } else {
            System.out.println("This number is ordinary");
        }
    }
}
