package module15;

import java.util.Scanner;

public class Task34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = scanner.nextInt();
        int sum = 0, numbers = 1;
        while (sum <= number) {
            numbers++;
            sum += (int) Math.pow(numbers, 2);
            if (sum <= number) {
                System.out.println(numbers + " (" + sum + ")");
            }
        }
        System.out.println("\n" + (numbers - 1));
    }
}
