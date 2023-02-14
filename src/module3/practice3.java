package module3;

import java.util.Scanner;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number1, number2, number3;
        System.out.println("Enter how much money did you earn");
        number1 = sc.nextDouble();
        System.out.println("Enter how much money your parents gave you");
        number2 = sc.nextDouble();
        number3 = (number1 + number2) * 0.027;
        System.out.println("You have $" + number3 + " for your trip abroad");
    }
}


//task9
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a, b ,c , all;
//        System.out.println("Enter 3 numbers");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        c = sc.nextInt();
//        all = a*10 + b * 100 + c +1000;
//        System.out.println("You got " + all + " points in total");
//        }


//task8
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double base, height, p, s;
//        System.out.println("Please enter the length of the base of an isosceles triangle");
//        base = sc.nextDouble();
//        System.out.println("Please enter the height of an isosceles triangle");
//        height = sc.nextDouble();
//        p = base + 2*height;
//        s = (base * height) / 2;
//        System.out.println(p);
//        System.out.println(s);
//        }
//
//
//task7
//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number, number2, number3, number4;
//        System.out.println("Please enter your number");
//        number = scanner.nextInt();
//        number2 = number - 2;
//        number3 = number2 - 2;
//        number4 = number3 - 2;
//        System.out.println(number2);
//        System.out.println(number3);
//        System.out.println(number4);
//        }

//task6
//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int number, number2, number3, number4;
//        System.out.println("Please enter your number");
//        number = scanner.nextInt();
//        number2 = number +2;
//        number3 = number2 +2;
//        number4 = number3 + 2;
//        System.out.println(number2 + " " + number3 + " " +number4);
//        }


//task 5
//public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    double cathet1, cathet2, hypotenuse, square, p;
//    System.out.println("Enter the length of the 1st cathet");
//    cathet1 = sc.nextDouble();
//    System.out.println("Enter the length of the 2nd cathet");
//    cathet2 = sc.nextDouble();
//    System.out.println("Enter the length of the hypotenuse");
//    hypotenuse = sc.nextDouble();
//    square = 1.0/ 2.0 * cathet1 * cathet2;
//    p = cathet1 + cathet2 + hypotenuse;
//    System.out.println("The square of the triangle is " + square);
//    System.out.println("The perimetr of the triangle is " + p);
//}


//    task4
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double hryvnq, dollar;
//        System.out.println("How much money do you have?");
//        hryvnq = sc.nextInt();
//        dollar = hryvnq * 0.027;
//        System.out.println(dollar);
//        }


//task 3
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double dyum, sm;
//        System.out.println("Enter your number in dyum");
//        dyum = scanner.nextInt();
//        sm = dyum * 2.54;
//        System.out.println(sm);
//    }

//task 2
//public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    double dyum, sm;
//    System.out.println("Enter your number in sm");
//    sm = scanner.nextInt();
//    dyum = sm / 2.54;
//    System.out.println(dyum);
//}

//task1
//public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        double temperatureF, temperatureC;
//        System.out.println("Enter your temperature");
//        temperatureF = scanner.nextInt();
//        temperatureC = 5.0 * (temperatureF - 32)/9;
//        System.out.println(temperatureC);
//        }