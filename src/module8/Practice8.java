package module8;

import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Practice8 {
    public static void main(String[] args) {
        task26a();

    }

    public static void task30() {
        Scanner sc = new Scanner(System.in);
        int firstNumber, secondNumber, realNumber, a;
        System.out.println("Enter two numbers");
        firstNumber = sc.nextInt();
        secondNumber = sc.nextInt();
        if (firstNumber < secondNumber) {
            System.out.println("Nothing is counting");
        } else {
            realNumber = firstNumber / secondNumber;
            a = firstNumber - secondNumber * realNumber;
            System.out.println(realNumber + " " + a + "/" + secondNumber);
        }
    }

    public static void task28() {
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        System.out.println("Enter two numbers");
        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();
        if (secondNumber == 0) {
            System.out.println("Not a fraction");
        } else if (firstNumber < secondNumber) {
            System.out.println("this is a correct fraction");
        } else if (firstNumber % secondNumber != 0) {
            System.out.println("This fraction is a wrong one ");
        } else {
            System.out.println("This number is whole");
        }
    }

    public static void task26a() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter a number");
        number = sc.nextInt();
        if (number < 10) {
            System.out.println("Palindrome");
        } else if (number < 100) {
            int firstDigit, lastDigit;
            firstDigit = number / 10;
            lastDigit = number % 10;
            if (firstDigit == lastDigit) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not");
            }
        } else if (number < 1000) {
            int firstDigit, secondDigit, lastDigit;
            firstDigit = number / 100;
            secondDigit = number / 10 % 10;
            lastDigit = number % 10;
            if (number == lastDigit * 100 + secondDigit * 10 + firstDigit) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not");
            }
        } else if (number < 10000) {
            int firstDigit, a, secondDigit, thirdDigit, lastDigit;
            firstDigit = number / 1000;
            a = number - firstDigit * 1000;
            secondDigit = a / 100;
            thirdDigit = a / 10 % 10;
            lastDigit = a % 10;
            if (number == lastDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not");
            }
        } else if (number < 100000) {
            int firstDigit, a, b, secondDigit, thirdDigit, fourthDigit, lastDigit;
            firstDigit = number / 10000;
            a = number - firstDigit * 10000;
            secondDigit = a / 1000;
            b = a - secondDigit * 1000;
            thirdDigit = b / 100;
            fourthDigit = b / 10 % 10;
            lastDigit = b % 10;
            if (number == lastDigit * 10000 + fourthDigit * 1000 + thirdDigit * 100 + secondDigit * 10 + firstDigit) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not");
            }
        }
    }

    public static void task26() {
        Scanner sc = new Scanner(System.in);
        String number;
        System.out.println("Enter a number");
        number = sc.next();
        if (Objects.equals(number, new StringBuffer(number).reverse().toString())) {
            System.out.println("Palindrome");
        } else {
            System.out.println("No");
        }
    }

    public static void task24() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (number > 500) {
            System.out.println(lastDigit * 100 + secondDigit * 10 + firstDigit);
        } else {
            System.out.println(firstDigit * 100 + lastDigit * 10 + secondDigit);
        }
    }

    public static void task22() {
        Scanner sc = new Scanner(System.in);
        int number, lastDigit, newNumber;
        System.out.println("Enter a number");
        number = sc.nextInt();
        lastDigit = number % 10;
        if (number % 2 == 0) {
            newNumber = (number / 10 + 1) * 10;
            System.out.println("Up to " + newNumber);
        } else {
            newNumber = (number / 10) * 10;
            System.out.println("Down to " + newNumber);
        }

    }

    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (firstDigit == 0 || secondDigit == 0 || lastDigit == 0) {
            System.out.println("There is 0 in the number");
        } else {
            System.out.println("There is no 0 in the number");
        }
    }

    public static void task19() {
        Scanner sc = new Scanner(System.in);
        int number, firstTwoDigits, lastTwoDigits;
        System.out.println("Enter your number");
        number = sc.nextInt();
        firstTwoDigits = number / 100;
        lastTwoDigits = number % 100;
        if (firstTwoDigits == lastTwoDigits) {
            System.out.println("The number is pair-symmetric");
        } else {
            System.out.println("The number is not pair-symmetric");
        }


    }

    public static void task17() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit, sumOfAllDigits;
        System.out.println("Enter a number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        sumOfAllDigits = firstDigit + secondDigit + lastDigit;
        if (number % 2 == 0 && sumOfAllDigits % 2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task15() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, lastDigit;
        System.out.println("Enter a number");
        number = sc.nextInt();
        firstDigit = number / 10;
        lastDigit = number % 10;
        if (firstDigit > lastDigit) {
            System.out.println("The 1st digit is higher than the last one");
        } else if (lastDigit > firstDigit) {
            System.out.println("The 2nd digit is higher than the 1st one");
        }
    }

    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, lastDigit;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 10;
        lastDigit = number % 10;
        if (firstDigit == lastDigit) {
            System.out.println("The digits are the same");
        } else {
            System.out.println("The digits are different");
        }
    }

    public static void task11() {
        Scanner sc = new Scanner(System.in);
        int students, chairs;
        System.out.println("Enter the number of students");
        students = sc.nextInt();
        System.out.println("Enter the number of chairs");
        chairs = sc.nextInt();
        if (chairs >= students) {
            System.out.println("There are " + (chairs - students) + " chairs left free");
        } else {
            System.out.println("Not enough chairs for everyone");
        }
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        if (number < 0) {
            System.out.println(Math.pow(number, 2));
        } else {
            System.out.println("Error");
        }
    }

    public static void task5e() {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter a number");
        x = scanner.nextInt();
        if (x > 0) {
            x = x + 1;
        } else {
            x = x - 1;
        }
        System.out.println(x);
    }

    public static void task5d() {
        Scanner scanner = new Scanner(System.in);
        int x, a;
        System.out.println("Enter two numbers");
        x = scanner.nextInt();
        a = scanner.nextInt();
        if (x != a) {
            a = x;
        } else {
            x = 2 * a;
        }
        System.out.println("a = " + a + " and x = " + x);

    }

    public static void task5c() {
        Scanner scanner = new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a = scanner.nextInt();
        if (a > 100) {
            System.out.println("The number is correct");
        } else {
            System.out.println("Error");
        }
    }

    public static void task5b() {
        Scanner scanner = new Scanner(System.in);
        int x, a;
        System.out.println("Enter two numbers");
        x = scanner.nextInt();
        a = scanner.nextInt();
        if (x > a) {
            a = -1;
        } else {
            a = 0;
        }
        System.out.println(a);
    }

    public static void task5a() {
        Scanner scanner = new Scanner(System.in);
        int x;
        System.out.println("Enter your number");
        x = scanner.nextInt();
        if (x > 0) {
            System.out.println("+");
        } else {
            System.out.println("not +");
        }
    }
}
