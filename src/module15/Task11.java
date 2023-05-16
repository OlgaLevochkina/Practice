package module15;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();
        int sumOfFirstNumbers = 0, sumOfSecondNumbers = 0;
        sumOfFirstNumbers += numberOne;
        sumOfSecondNumbers += numberTwo;
        while (numberOne != numberTwo) {
            System.out.println("Enter two more numbers");
            numberOne = scanner.nextInt();
            numberTwo = scanner.nextInt();
            sumOfFirstNumbers += numberOne;
            sumOfSecondNumbers += numberTwo;
        }
        sumOfFirstNumbers -= numberOne;
        sumOfSecondNumbers -= numberTwo;
        System.out.println("The sum of the first numbers is " + sumOfFirstNumbers);
        System.out.println("The sum of the second numbers is " + sumOfSecondNumbers);
    }
}
