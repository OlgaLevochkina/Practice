package module12;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
