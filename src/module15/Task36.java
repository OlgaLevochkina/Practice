package module15;

import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int clientNumber = scanner.nextInt();
        int number = 10;
        while (number < clientNumber) {
            int numberSquared = (int) Math.pow(number, 2);
            if (numberSquared == clientNumber) {
                System.out.println("Yes - " + number);
                break;
            }
            number++;
        }
        if (number == clientNumber) {
            System.out.println("This number doesn't exist");
        }
    }
}
