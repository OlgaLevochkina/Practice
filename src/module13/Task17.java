package module13;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two first numbers of your sequence of numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int nextNumber, sum = numberOne + numberTwo;
        System.out.println("Enter one more number");
        int quantity = scanner.nextInt();
        for (int i = 3; i <= quantity; i++) {
            nextNumber = numberOne + numberTwo;
            System.out.print(nextNumber + " ");
            numberOne = numberTwo;
            numberTwo = nextNumber;
            sum += nextNumber;
        }
        System.out.println("\nThe sum is " + sum);
    }
}
