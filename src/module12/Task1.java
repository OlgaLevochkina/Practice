package module12;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, count = 0;
        for (int i = 1; i < 11; i++) {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            if (number > 0) {
                count++;
            }
        }
        System.out.println("The number of positive numbers is " + count);
    }
}

