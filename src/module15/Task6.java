package module15;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int count = 0, sum = 0;
        while (number != 999) {
            count++;
            sum += number;
            number = scanner.nextInt();
        }
        System.out.println("Quantity - " + count);
        System.out.println("The total sum is " + sum);

    }
}
