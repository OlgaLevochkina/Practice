package module4;

import java.util.Scanner;

public class practice4 {
    public static void main(String[] args) {
        task26();
    }

    public static void task26() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, firstNumberOne, secondNumberOne, x, y;
        System.out.println("Enter two numbers");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        firstNumberOne = firstNumber / 100;
        secondNumberOne = secondNumber / 100;
        x = firstNumber - firstNumberOne * 100 + secondNumberOne * 100;
        y = secondNumber - secondNumberOne * 100 + firstNumberOne * 100;
        System.out.println(x + " " + y);

    }

    public static void task25() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber, firstNewNumber, secondNewNumber;
        System.out.println("Enter two numbers");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        firstNewNumber = firstNumber - firstNumber % 10 + secondNumber % 10;
        secondNewNumber = secondNumber - secondNumber % 10 + firstNumber % 10;
        System.out.println(firstNewNumber + " " + secondNewNumber);
    }


    public static void task24() {
        Scanner sc = new Scanner(System.in);
        int numberOne, numberTwo;
        System.out.println("Enter two numbers pls");
        numberOne = sc.nextInt();
        numberTwo = sc.nextInt();
        int newFirstNumber = numberOne - numberOne % 10 + numberTwo % 10;
        int newSecondNumber = numberTwo - numberTwo % 10 + numberOne % 10;
        System.out.println(newFirstNumber + " " + newSecondNumber);
    }

    public static void task23() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, newShortDigitX, firstX, secondX, lastX, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 1000;
        newShortDigitX = number - firstDigit * 1000;
        firstX = newShortDigitX / 100;
        secondX = (number / 10) % 10;
        lastX = number % 10;
        newNumber = lastX * 1000 + firstDigit * 100 + firstX * 10 + secondX;
        System.out.println(newNumber);
    }

    public static void task22() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = (number / 10) % 10;
        lastDigit = number % 10;
        newNumber = lastDigit * 100 + firstDigit * 10 + secondDigit;
        System.out.println(newNumber);
    }


    public static void task21() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, newShortDigitX, firstX, secondX, lastX, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 1000;
        newShortDigitX = number - firstDigit * 1000;
        firstX = newShortDigitX / 100;
        secondX = (number / 10) % 10;
        lastX = number % 10;
        newNumber = firstX * 1000 + secondX * 100 + lastX * 10 + firstDigit;
        System.out.println(newNumber);
    }

    public static void task20() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = (number / 10) % 10;
        lastDigit = number % 10;
        newNumber = secondDigit * 100 + lastDigit * 10 + firstDigit;
        System.out.println(newNumber);
    }

    public static void task19() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, newShortDigitX, firstX, secondX, lastX, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 1000;
        newShortDigitX = number - firstDigit * 1000;
        firstX = newShortDigitX / 100;
        secondX = (number / 10) % 10;
        lastX = number % 10;
        newNumber = firstX * 1000 + secondX * 100 + lastX * 10;
        System.out.println(newNumber);
    }

    public static void task18() {
        Scanner sc = new Scanner(System.in);
        int number, secondDigit, lastDigit, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        secondDigit = (number / 10) % 10;
        lastDigit = number % 10;
        newNumber = secondDigit * 100 + lastDigit * 10;
        System.out.println(newNumber);
    }

    public static void task17() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, newShortDigitX, firstX, secondX, lastX, newNumber;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        firstDigit = number / 1000;
        newShortDigitX = number - firstDigit * 1000;
        firstX = newShortDigitX / 100;
        secondX = (number / 10) % 10;
        lastX = number % 10;
        newNumber = lastX * 1000 + secondX * 100 + firstX * 10 + firstDigit;
        System.out.println(newNumber);
    }

    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit, newNumber;
        System.out.println("Enter your number please");
        number = scanner.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        thirdDigit = number % 10;
        newNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(newNumber);
    }


    public static void task15() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit, fourthDigit, evenNumberCount = 0;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 1000;
        secondDigit = number / 100 % 10;
        thirdDigit = number / 10 % 10;
        fourthDigit = number % 10;
        if (firstDigit % 2 == 0) {
            evenNumberCount++;
        }
        if (secondDigit % 2 == 0) {
            evenNumberCount++;
        }
        if (thirdDigit % 2 == 0) {
            evenNumberCount++;
        }
        if (fourthDigit % 2 == 0) {
            evenNumberCount++;
        }
        System.out.println("You have " + evenNumberCount + " even number(s)");
    }


    public static void task14() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit, evenNumberCount = 0;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        thirdDigit = number % 10;
        if (firstDigit % 2 == 0) {
            evenNumberCount++;
        }
        if (secondDigit % 2 == 0) {
            evenNumberCount++;
        }
        if (thirdDigit % 2 == 0) {
            evenNumberCount++;
        }
        System.out.println("You have " + evenNumberCount + " even number(s)");
    }


    public static void task13() {
        Scanner sc = new Scanner(System.in);
        int number, number1, number2, evenNumberCount = 0;
        System.out.println("Enter your number");
        number = sc.nextInt();
        number1 = number / 10;
        number2 = number % 10;
        if (number1 % 2 == 0) {
            evenNumberCount++;
        }
        if (number2 % 2 == 0) {
            evenNumberCount++;
        }
        System.out.println("You have " + evenNumberCount + " even number(s)");
    }


    public static void task12() {
        Scanner sc = new Scanner(System.in);
        int number, numberOfHungreds, numberOfTens, thirdDigit, result;
        System.out.println("Enter your number");
        number = sc.nextInt();
        numberOfHungreds = number / 100 * 100;
        numberOfTens = (number / 10 % 10) * 10;
        thirdDigit = number % 10;
        result = (numberOfHungreds - thirdDigit) * numberOfTens;
        System.out.println(result);

    }

    public static void task11() {
        Scanner scanner = new Scanner(System.in);
        int number, numberOfTens, secondDigit, result;
        System.out.println("Enter your number");
        number = scanner.nextInt();
        numberOfTens = number / 10 * 10;
        secondDigit = number % 10;
        result = numberOfTens - secondDigit;
        System.out.println(result);
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit, result;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        thirdDigit = number % 10;
        result = firstDigit + secondDigit + thirdDigit;
        System.out.println(result);
    }


    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, result;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 10;
        secondDigit = number % 10;
        result = firstDigit + secondDigit;
        System.out.println(result);
    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, thirdDigit, result;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        thirdDigit = number % 10;
        result = thirdDigit * 100 + secondDigit * 10 + firstDigit - 20;
        System.out.println(result);
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit1, secondDigit, result;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstDigit1 = number / 10;
        secondDigit = number % 10;
        result = secondDigit * 10 + firstDigit1 + 8;
        System.out.println(result);
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int number, number1, number2, number3;
        System.out.println("Enter your number");
        number = sc.nextInt();
        number1 = number / 100 * 100;
        number2 = (number / 10 % 10) * 10;
        number3 = number % 10;
        System.out.println(number1 + " + " + number2 + " + " + number3);
    }


    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int initialNumber, number1, number2;
        System.out.println("Enter your number");
        initialNumber = sc.nextInt();
        number1 = (initialNumber / 10) * 10;
        number2 = initialNumber % 10;
        System.out.println(initialNumber + " = " + number1 + " + " + number2);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int initialNumber, firstNumber, middleNumber, lastNumber;
        System.out.println("Enter your number");
        initialNumber = sc.nextInt();
        firstNumber = initialNumber / 100;
        middleNumber = initialNumber / 10 % 10;
        lastNumber = initialNumber % 10;
        System.out.println(lastNumber + " " + middleNumber + " " + firstNumber);
    }

    public static void task3() {
        Scanner sc = new Scanner(System.in);
        int initialNumber, firstNumber, lastNumber;
        System.out.println("Please enter your number");
        initialNumber = sc.nextInt();
        firstNumber = initialNumber / 10;
        lastNumber = initialNumber % 10;
        System.out.println(lastNumber + " " + firstNumber);
    }

    public static void task2() {
        Scanner sc = new Scanner(System.in);
        int initialNumber, firstNumber, middleNumber, lastNumber;
        System.out.println("Enter your number");
        initialNumber = sc.nextInt();
        firstNumber = initialNumber / 100;
        middleNumber = initialNumber / 10 % 10;
        lastNumber = initialNumber % 10;
        System.out.println(firstNumber + " " + middleNumber + " " + lastNumber);
    }


    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        int number, number2, number3;
        System.out.println("Enter your number");
        number = scanner.nextInt();
        number2 = number / 10;
        number3 = number % 10;
        System.out.println(number2 + " " + number3);
    }
}