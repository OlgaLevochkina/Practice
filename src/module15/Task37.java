package module15;

import java.util.Scanner;

public class Task37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int clientNumber = sc.nextInt();
        int requiredNumber = 10;
        while (requiredNumber < 100) {
            int firstDigit = requiredNumber / 10;
            int lastDigit = requiredNumber % 10;
            int sum = firstDigit + lastDigit;
            if (sum == clientNumber) {
                System.out.println(requiredNumber);
                break;
            }
            requiredNumber++;
        }
        if (requiredNumber == clientNumber) {
            System.out.println("This number doesn't exist");
        }
    }
}
