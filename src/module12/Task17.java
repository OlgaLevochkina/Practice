package module12;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int countDivisorOfFirstNumber = 0, countDivisorOfSecondNumber = 0;
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        for (int i = 2; i < numberOne; i++) {
            if (numberOne % i == 0) {
                countDivisorOfFirstNumber++;
            }
        }
        for (int i = 2; i < numberTwo; i++) {
            if (numberTwo % i == 0) {
                countDivisorOfSecondNumber++;
            }
        }
        System.out.println("First number - the total number of divisors is " + countDivisorOfFirstNumber);
        System.out.println("Second number - the total number of divisors is " + countDivisorOfSecondNumber);
        if (countDivisorOfFirstNumber == countDivisorOfSecondNumber) {
            System.out.println("The numbers are related");
        } else {
            System.out.println("The numbers are not related");
        }
    }
}
