package module12;

import java.util.Scanner;

public class Task16a {
    public static final int DIVIDER = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int allDividers = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                allDividers++;
            }
        }
        if (allDividers == DIVIDER) {
            System.out.println("This is a primary number");
        } else {
            System.out.println("This is not a primary number");
        }

    }
}
