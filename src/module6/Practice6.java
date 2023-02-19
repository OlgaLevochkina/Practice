package module6;

import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        task11();

    }


    public static void task14() {
        Scanner scanner = new Scanner(System.in);
        int numerator, denominator;
        System.out.println("Enter two primary numbers");
        numerator = scanner.nextInt();
        denominator = scanner.nextInt();
        if (numerator * denominator > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public static void task13() {
        Scanner sc = new Scanner(System.in);
        int numerator, denominator;
        System.out.println("Enter two primary numbers");
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        if (numerator < denominator) {
            System.out.println("Your fraction is a correct one");
        } else {
            System.out.println("Your fraction is not a correct one");
        }
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int firstValue, secondValue, thirdValue, result;
        System.out.println("Enter three numbers");
        firstValue = scanner.nextInt();
        secondValue = scanner.nextInt();
        thirdValue = scanner.nextInt();
        result = secondValue * secondValue - 4 * firstValue * thirdValue;
        if (result < 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    public static void task11() {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter two numbers");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        if (number1 > 0 && number2 > 0 || number1 < 0 && number2 < 0) {
            System.out.println("The numbers are the same");
        }
        if (number1 > 0 && number2 < 0 || number1 < 0 && number2 > 0) {
            System.out.println("The numbers are different");
        }
        if (number1 * number2 == 0) {
            System.out.println("Error");
        }
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, lastDigit, multiplication;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 10;
        lastDigit = number % 10;
        multiplication = firstDigit * lastDigit;
        if (number > multiplication) {
            System.out.println("The number is higher");
        }
        if (number < multiplication) {
            System.out.println("The multiplication is higher");
        }
    }


    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        thirdDigit = number % 10;
        if (firstDigit % 2 == 0 && secondDigit % 2 == 0 && thirdDigit % 2 == 0) {
            System.out.println("Your number is beautifully even");
        }
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Enter two numbers");
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber * secondNumber);
        }
        if (firstNumber == secondNumber) {
            System.out.println("Your numbers are equal");
        }
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        if (number >= 100 && number <= 999) {
            number = number - 1;
            System.out.println(number);
        }
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        if (number > 0) {
            System.out.println("Your number is positive");
        }
        if (number < 0) {
            System.out.println("Your number is negative");
        }
        if (number == 0) {
            System.out.println("Your number is 0");
        }
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = sc.nextInt();
        if (number == 0) {
            System.out.println(number);
        }
    }

    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = scanner.nextInt();
        if (number > 0) {
            number = number * 2;
            System.out.println(number);
        }
    }
}
