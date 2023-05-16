package module15;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int nextNumber = number + 1;
        int sum = 0;
        sum = sum + nextNumber;
        while (sum <= Math.pow(number, 2)) {
            System.out.println(nextNumber + " (" + sum + ") ");
            nextNumber++;
            sum += nextNumber;
        }
    }
}
