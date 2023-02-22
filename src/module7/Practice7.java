package module7;

import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        task10();

    }

    public static void task11() {
        Scanner sc = new Scanner(System.in);
        int numberA, numberB;
        System.out.println("Enter two numbers");
        numberA = sc.nextInt();
        numberB = sc.nextInt();
        if (numberA > numberB) {
            System.out.println(numberB + " " + numberA);
            System.out.println(numberA + " " + numberB);
        }
        if (numberB > numberA) {
            System.out.println(numberA + " " + numberB);
            System.out.println(numberB + " " + numberA);
        }
    }

    public static void task10() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = scanner.nextInt();
        if (number < 0) {
            System.out.println(-number);
        } else {
            System.out.println(0);
        }
    }

    public static void task9() {
        Scanner sc = new Scanner(System.in);
        int cathet1, cathet2, hypotenuse;
        System.out.println("Enter two cathets");
        cathet1 = sc.nextInt();
        cathet2 = sc.nextInt();
        System.out.println("Enter the hypotenuse");
        hypotenuse = sc.nextInt();
        if (Math.pow(hypotenuse, 2) == (Math.pow(cathet1, 2) + Math.pow(cathet2, 2))) {
            System.out.println("This is right triangle"); //4,3,5
        } else {
            System.out.println("Bullshit");
        }

    }

    public static void task8() {
        Scanner sc = new Scanner(System.in);
        int students, tables;
        System.out.println("Enter the number of students and then the number of tables");
        students = sc.nextInt();
        tables = sc.nextInt();
        if (tables * 2 >= students) {
            System.out.println("Everyone will have a seat");
        } else {
            System.out.println("There is not enough tables for everyone");
        }
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int students, chairs;
        System.out.println("Enter the number of students and then the number of chairs");
        students = sc.nextInt();
        chairs = sc.nextInt();
        if (chairs >= students) {
            System.out.println("Everyone will have a seat");
        } else {
            System.out.println("There is not enough chairs for everyone");
        }
    }

    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int number1, number2;
        System.out.println("Enter two numbers");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        if (number1 == number2) {
            System.out.println("The numbers are the same");
        } else {
            System.out.println("The numbers are different");
        }
    }

    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter the number");
        number = scanner.nextInt();
        if (number > 0) {
            System.out.println("This number is positive");
        } else {
            System.out.println("This number is negative");
        }
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        int number, number2;
        System.out.println("Enter your number");
        number = sc.nextInt();
        number2 = number % 100;
        if (number == number2) {
            System.out.println("Ok");  //10
        } else {
            System.out.println("No");
        }
        System.out.println(number2);
    }

    public static void task3() {
        int a = 4, b = 4;
        if (a % 3 == b % 4) {
            System.out.println(a - b);
        } else {
            System.out.println(b - a);
        }
        System.out.println(a % 3);
        System.out.println(b % 4);
    }
}
