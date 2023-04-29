package module13;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            double a = Math.sqrt(2 * i - 1);
            System.out.print(a + " ");
            sum += a;
        }
        System.out.println("\n" + sum);
    }
}
