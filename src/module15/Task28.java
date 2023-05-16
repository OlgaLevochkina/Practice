package module15;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0;
        while (number >= 10) {
            number /= 10;
            count++;
        }
        count++;
        System.out.println("The number of digits is " + count);
    }
}
