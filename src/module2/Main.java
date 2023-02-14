package module2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, surname, middleName;
        System.out.println("Please enter your last name");
        surname = sc.nextLine();
        System.out.println("Please enter your name");
        name = sc.nextLine();
        System.out.println("Please enter your middle name");
        middleName = sc.nextLine();
        System.out.println("Your name is " + name.charAt(0) + "." + middleName.charAt(0) + ". " + surname);
        task38();
        task37();
        task36();


    }

    public static void task38() {
        Scanner sc = new Scanner(System.in);
        String name, surname, middleName;
        System.out.println("Please enter your name");
        name = sc.nextLine();
        System.out.println("Please enter your middle name");
        middleName = sc.nextLine();
        System.out.println("Please enter your last name");
        surname = sc.nextLine();
        System.out.println("Your name is " + name.charAt(0) + " " + middleName.charAt(0) + " " + surname);
    }

    public static void task37() {
        Scanner sc = new Scanner(System.in);
        String name, surname;
        System.out.println("Please enter your name");
        name = sc.nextLine();
        System.out.println("Please enter your last name");
        surname = sc.nextLine();
        System.out.println(surname + " " + name);
        System.out.println(name + " " + surname);
    }

    public static void task36() {
        Scanner sc = new Scanner(System.in);
        String surname, city;
        System.out.println("Please enter your last name");
        surname = sc.nextLine();
        System.out.println("Please enter the city you are going to");
        city = sc.nextLine();
        System.out.println("Mr " + surname + " is going to " + city);
    }

    public static void task35() {
        Scanner sc = new Scanner(System.in);
        String name, surname;
        System.out.println("Please enter your name and surname");
        name = sc.nextLine();
        surname = sc.nextLine();
        System.out.println("Your name is " + name + " " + surname);
    }


    public static void task34() {
        Scanner scanner = new Scanner(System.in);
        String word = "Hello";
        String name;
        System.out.println("Please enter your name");
        name = scanner.nextLine();
        System.out.println(word + ", " + name);
    }


    public static void task33() {
        Scanner scanner = new Scanner(System.in);
        double sideA, sideB, height;
        System.out.println("Please enter two sides of the trapezoid");
        sideA = scanner.nextInt();
        sideB = scanner.nextInt();
        System.out.println("Please enter the height of the trapezoid");
        height = scanner.nextInt();
        System.out.println("The square of the trapezoid is " + ((sideA + sideB) / 2) * height);
    }


    public static void task32() {
        Scanner sc = new Scanner(System.in);
        double number;
        System.out.println("Please enter your number");
        number = sc.nextInt();
        System.out.println(number * (1 / number));
    }


    public static void task31() {
        Scanner sc = new Scanner(System.in);
        int weight, speed;
        System.out.println("Enter your weight");
        weight = sc.nextInt();
        System.out.println("Enter your speed");
        speed = sc.nextInt();
        System.out.println("The kinetic energy of the body is " + (weight / 2 + Math.pow(speed, 2)));
    }


    public static void task30() {
        Scanner scanner = new Scanner(System.in);
        int hours, minutes, minutes1, minutes2;
        System.out.println("What time is it");
        hours = scanner.nextInt();
        minutes = scanner.nextInt();
        System.out.println("The same time in seconds will be " + (hours * 3600 + minutes * 60));
        System.out.println("It has been " + (hours * 60 + minutes) + " minutes since midnight");
        System.out.println(24 * 60 - (hours * 60 + minutes) + " minutes left till midnight");
    }


    public static void task29() {
        Scanner scanner = new Scanner(System.in);
        int hours;
        System.out.println("Enter the number of hours");
        hours = scanner.nextInt();
        System.out.println("This number of hours is equal to " + (hours * 60 * 60) + " seconds");
    }


    public static void task28() {
        Scanner sc = new Scanner(System.in);
        double cableLength;
        System.out.println("Please enter the distance in cable length");
        cableLength = sc.nextInt();
        System.out.println("The same distance in metres will be " + cableLength * 185.2);
        System.out.println("The same distance in km will be " + cableLength * 0.185);
    }


    public static void task27() {
        Scanner sc = new Scanner(System.in);
        double weightInGramms;
        System.out.println("Please enter your weight in grams");
        weightInGramms = sc.nextInt();
        System.out.println("Your weight is " + (weightInGramms * 0.001) + "kg");
    }


    public static void task26() {
        Scanner sc = new Scanner(System.in);
        int yearOfBirth, currentYear;
        System.out.println("Please enter your year of birth");
        yearOfBirth = sc.nextInt();
        System.out.println("Please enter the current year");
        currentYear = sc.nextInt();
        System.out.println("Your age is " + (currentYear - yearOfBirth));
    }


    public static void task25() {
        Scanner sc = new Scanner(System.in);
        int sideSurface1, sideSurface2, height;
        System.out.println("Enter the 1st side surface of the parallelepiped");
        sideSurface1 = sc.nextInt();
        System.out.println("Enter the 2nd side surface of the parallelepiped");
        sideSurface2 = sc.nextInt();
        System.out.println("Enter the height of the parallelepiped");
        height = sc.nextInt();
        System.out.println("The volume of the parallelepiped is  " + sideSurface1 * sideSurface2 * height);
        System.out.println("The square of the side surface is " + (2 * height * (sideSurface1 + sideSurface2)));
        System.out.println("The total square of the parallelepiped is " + (2 * (sideSurface2 * sideSurface1 + sideSurface1 * height + height * sideSurface2)));
        System.out.println("The perimeter of the parallelepiped is " + (4 * (height + sideSurface1 + sideSurface2)));
    }

    public static void task24() {
        Scanner sc = new Scanner(System.in);
        int sideA, sideB;
        System.out.println("Enter two numbers");
        sideA = sc.nextInt();
        sideB = sc.nextInt();
        System.out.println("The square of the rectangle is " + sideA * sideA);
        System.out.println("The perimeter of the rectangle is " + (2 * (sideA + sideB)));
    }


    public static void task23() {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, e;
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = Math.pow(a, 2);
        d = Math.pow(b, 2);
        System.out.println(c);
        System.out.println(d);
        System.out.println(c + d);
    }


    public static void task22() {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter two numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a * b);
        System.out.println(a - b);
        System.out.println(b - a);
    }


    public static void task21() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        System.out.println(number + 1);
        System.out.println(number + 2);
        System.out.println(number + 3);
    }


    public static void task20() {
        Scanner scanner = new Scanner(System.in);
        int yourNumber;
        System.out.println("Enter your number");
        yourNumber = scanner.nextInt();
        System.out.println(yourNumber);
        System.out.println(-yourNumber);

    }

    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int yourNumber;
        System.out.println("Enter your number");
        yourNumber = scanner.nextInt();
        System.out.println((yourNumber - 1) + " " + yourNumber + " " + (yourNumber + 1));
    }


    public static void task18() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number pls");
        number = scanner.nextInt();
        System.out.println("Your number ^2 is " + (Math.pow(number, 2)) + " & your number ^ 3 is " + (Math.pow(number, 3)));
    }


    public static void task17() {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number pls");
        number = scanner.nextInt();
        System.out.println("Your number ^2 is " + (Math.pow(number, 2)));
    }


    public static void task16() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number pls");
        number = sc.nextInt();
        System.out.println("Option 1: " + (number + 6));
        System.out.println("Option 2: " + (number - 12));
    }


    public static void task15() {
        Scanner scanner = new Scanner(System.in);
        int clientNumber;
        System.out.println("Please, enter your number");
        clientNumber = scanner.nextInt();
        System.out.println("The new number is " + (clientNumber * 10));
    }


    public static void task14() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number please");
        number = sc.nextInt();
        int newNumber = number + 10;
        System.out.println("The new number is " + newNumber);
    }

    public static void task13() {
        int a = 9, b = 5;
        int c = a + b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("the sum of a and b is " + c);

        double x = 7.5, e = Math.pow(x, 2), d = Math.pow(x, 3);
        System.out.println("x = " + x);
        System.out.println("x^2 = " + e);
        System.out.println("x^3 = " + d);

        int a1 = 2, a2 = 3;
        int b1 = a1 * 10 + a2;
        System.out.println("Our first number is " + a1);
        System.out.println("Our second number is " + a2);
        System.out.println("Our new number is " + b1);

        int x1 = 33, x2 = x1 / 3;
        System.out.println("Should our 1st number be " + x1 + ",then 1/3 of this number is " + x2);


    }

    public static void task12() {
        System.out.println("*********");
        System.out.println(" ******* ");
        System.out.println("  *****  ");
        System.out.println("   ***   ");
        System.out.println("  *****  ");
        System.out.println(" ******* ");
        System.out.println("*********");
    }

    public static void task11() {
        String name = "Olga", surname = "Levochkina", number = "+359893908877";
        System.out.println("*******************");
        System.out.println("* " + name + " " + surname + " *");
        System.out.println("* " + number + "   *");
        System.out.println("*******************");
    }
}





