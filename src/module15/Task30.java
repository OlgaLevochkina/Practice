package module15;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        while (number > 0) {
            if (number % 10 == 0) {
                count++;
            }
            number = number / 10;
        }
        System.out.println("The quantity is " + count);
    }
}
