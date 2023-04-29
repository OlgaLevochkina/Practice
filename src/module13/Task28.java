package module13;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first two numbers");
        int firstValue = scanner.nextInt();
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second two numbers");
        int secondValue = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int maxNumber, minNumber, minValue, maxValue;
        if (firstNumber > secondNumber) {
            maxNumber = firstNumber;
            minNumber = secondNumber;
            maxValue = firstValue;
            minValue = secondValue;
        } else {
            maxNumber = secondNumber;
            minNumber = firstNumber;
            maxValue = secondValue;
            minValue = firstValue;
        }
        int distance = (maxValue - minValue) / (maxNumber - minNumber);
        if (maxNumber - minNumber == 1) {
            System.out.println("Error");
        } else {
            for (int i = minNumber; i <= maxNumber - minNumber; i++) {
                System.out.println(minValue + distance * (i - 1));
            }
        }
    }
}