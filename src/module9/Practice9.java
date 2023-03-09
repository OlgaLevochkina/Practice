package module9;

import java.util.Scanner;

public class Practice9 {
    public static void main(String[] args) {
        task37();
    }


    public static void task37() {
        Scanner sc = new Scanner(System.in);
        String fullName1, fullName2, firstname1, firstname2, surname1, surname2;
        System.out.println("Enter 2 names");
        fullName1 = sc.nextLine();
        fullName2 = sc.nextLine();
        firstname1 = fullName1.split(" ")[0];
        surname1 = fullName1.split(" ")[1];
        firstname2 = fullName2.split(" ")[0];
        surname2 = fullName2.split(" ")[1];
        if (fullName1.equals(fullName2)) {
            System.out.println("Both names & surnames are the same");
        } else if (firstname1.equals(firstname2)) {
            System.out.println("Only first names are the same");
        } else if (surname1.equals(surname2)) {
            System.out.println("Only last names are the same");
        } else {
            System.out.println("Both names & surnames are different");
        }
    }

    public static void task36() {
        Scanner sc = new Scanner(System.in);
        String name1, name2;
        System.out.println("Enter 2 names");
        name1 = sc.nextLine();
        name2 = sc.nextLine();
        if (name1.equals(name2)) {
            System.out.println("Namesake");
        } else {
            System.out.println("Different");
        }
    }

    public static void task35() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your letter");
        char letter = in.next().charAt(0);
        if (letter >= 65 && letter <= 90 || letter >= 97 && letter <= 122) {
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        }
    }


    public static void task34() {
        Scanner sc = new Scanner(System.in);
        String symbolOne, symbolTwo;
        System.out.println("Enter 2 symbols");
        symbolOne = sc.nextLine();
        symbolTwo = sc.nextLine();
        if (symbolOne.equalsIgnoreCase(symbolTwo)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }

    public static void task33() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int nominator = scanner.nextInt();
        int denominator = scanner.nextInt();
        if (denominator == 0) {
            System.out.println("Not a fraction");
        }
        if (nominator < denominator) {
            System.out.println("Correct fraction");
        }
        if (nominator > denominator) {
            int celoeChislo = nominator / denominator;
            int novijChislitel = nominator % denominator;
            System.out.println(celoeChislo + " " + novijChislitel + "/" + denominator);
        }
    }

    public static void task32() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year");
        int year = sc.nextInt();
        if (year / 100 == 19) {
            if (year % 4 == 0) {
                System.out.println("Leap year");
            } else {
                System.out.println("Not a leap year");
            }
        } else {
            System.out.println("The year should be in the 20st century");
        }
    }

    public static void task31() {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = scanner.nextInt();
        if (year / 100 >= 15 && year / 100 <= 19) {
            System.out.println("It belongs to " + (year / 100 + 1) + " century");
        } else {
            System.out.println("Try again");
        }
    }

    public static void task30() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a 3-digit number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (number % firstDigit == 0) {
            System.out.println("1st digit");
        }
        if (secondDigit != 0 && number % secondDigit == 0) {
            System.out.println("2nd digit");
        }
        if (lastDigit != 0 && number % lastDigit == 0) {
            System.out.println("3rd digit");
        }
    }


    public static void task29() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        if (firstDigit != secondDigit && secondDigit != lastDigit && firstDigit != lastDigit) {
            System.out.println("All three are different");
        } else if (firstDigit == secondDigit && secondDigit == lastDigit) {
            System.out.println("All digits are the same");
        } else {
            System.out.println("Two digits are the same, one is different");
        }
    }

    public static void task28() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (firstDigit != secondDigit && secondDigit != lastDigit && lastDigit != firstDigit) {
            System.out.println("None");
        } else if (firstDigit == secondDigit && secondDigit == lastDigit) {
            System.out.println("Twice");
        } else {
            System.out.println("Once");
        }
    }

    public static void task27() {
        Scanner sc = new Scanner(System.in);
        int smallNumber, bigNumber, firstPart, secondPart, thirdPart, innerNumber = 0;
        System.out.println("Enter a 2-digit number");
        smallNumber = sc.nextInt();
        System.out.println("Enter a 4-digit number");
        bigNumber = sc.nextInt();
        firstPart = bigNumber / 100;
        secondPart = bigNumber / 10 % 100;
        thirdPart = bigNumber - firstPart * 100;
        if (firstPart == smallNumber) {
            innerNumber++;
        }
        if (secondPart == smallNumber) {
            innerNumber++;
        }
        if (thirdPart == smallNumber) {
            innerNumber++;
        }
        System.out.println("Total number of inner numbers is " + innerNumber);
    }

    public static void task26() {
        Scanner sc = new Scanner(System.in);
        int smallNumber, bigNumber, firstTwoDigits, secondTwoDigits, lastTwoDigits;
        System.out.println("Enter a 2-digit number");
        smallNumber = sc.nextInt();
        System.out.println("Enter a 4-digit number");
        bigNumber = sc.nextInt();
        firstTwoDigits = bigNumber / 100;
        secondTwoDigits = bigNumber / 10 % 100;
        lastTwoDigits = bigNumber - firstTwoDigits * 100;
        if (smallNumber == firstTwoDigits || smallNumber == secondTwoDigits || smallNumber == lastTwoDigits) {
            System.out.println("Inner number");
        } else {
            System.out.println("Not");
        }
    }

    public static void task25() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        if (secondDigit < firstDigit && secondDigit < lastDigit) {
            System.out.println("Pit");
        } else {
            System.out.println("Ordinary number");
        }
    }

    public static void task24() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        if (secondDigit > firstDigit && secondDigit > lastDigit) {
            System.out.println("Mountain");
        } else {
            System.out.println("Ordinary number");
        }
    }

    public static void task23() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        int firstDigit = number / 100;
        int secondDigit = number / 10 % 10;
        int lastDigit = number % 10;
        int sumOfAllDigits = firstDigit + secondDigit + lastDigit;
        int multiplication = firstDigit * secondDigit * lastDigit;
        if (sumOfAllDigits == multiplication) {
            System.out.println("twice an even number");
        } else {
            System.out.println("Try again");
        }

    }

    public static void task22() {
        Scanner scanner = new Scanner(System.in);
        int number, hryvnya100, hryvnya50, hryvnya10;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        hryvnya100 = number / 100;
        hryvnya50 = number % 100 / 50;
        hryvnya10 = number % 100 % 50;
        if (hryvnya100 * 100 + hryvnya50 * 50 + hryvnya10 * 10 == number) {
            System.out.println(hryvnya100 + " by 100 + " + hryvnya50 + " by 50 + " + hryvnya10 + " by 10");
        } else {
            System.out.println("Error");
        }
    }

    public static void task21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int time = sc.nextInt();
        if (time > 86400) {
            System.out.println("No calculations");
        } else {
            int hour = time / 3600;
            int minutes = time % 3600 / 60;
            int seconds = time % 3600 % 60;
            System.out.println("It is " + hour + " hours and " + minutes + " minutes and " + seconds + " seconds");
        }
    }

    public static void task20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the duration in seconds");
        int seconds = sc.nextInt();
        if (seconds > 3600) {
            System.out.println("No calculations");
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            System.out.println("It is " + minutes + " minutes and " + remainingSeconds + " seconds");
        }
    }

    public static void task19() {
        Scanner scanner = new Scanner(System.in);
        int sideA, sideB;
        System.out.println("Enter two numbers");
        sideA = scanner.nextInt();
        sideB = scanner.nextInt();
        if (sideA == sideB) {
            System.out.println("This is a square");
        } else {
            System.out.println("Rectangle");
        }

    }

    public static void task18() {
        Scanner sc = new Scanner(System.in);
        int sideA, sideB, sideC;
        System.out.println("Enter 3 numbers");
        sideA = sc.nextInt();
        sideB = sc.nextInt();
        sideC = sc.nextInt();
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }

    public static void task17() {
        Scanner sc = new Scanner(System.in);
        int angleA, angleB, angleC;
        System.out.println("Enter 3 numbers");
        angleA = sc.nextInt();
        angleB = sc.nextInt();
        angleC = sc.nextInt();
        if (angleA > 0 && angleB > 0 && angleC > 0) {
            if (angleA + angleB + angleC == 180) {
                System.out.println("This could be one triangle");
            } else {
                System.out.println("This is not one triangle");
            }
        } else {
            System.out.println("This is not a triangle");
        }
    }

    public static void task16() {
        Scanner scanner = new Scanner(System.in);
        int time;
        System.out.println("What time is it?");
        time = scanner.nextInt();
        if (time <= 0 || time > 24) {
            System.out.println("It is not time");
        } else if (time >= 6 && time <= 10) {
            System.out.println("Morning");
        } else if (time > 10 && time <= 18) {
            System.out.println("Day");
        } else if (time > 18 && time <= 22) {
            System.out.println("Evening");
        } else {
            System.out.println("Night");
        }
    }

    public static void task15() {
        Scanner sc = new Scanner(System.in);
        int monthNumber;
        System.out.println("Enter your month number");
        monthNumber = sc.nextInt();
        if (monthNumber <= 0 || monthNumber > 12) {
            System.out.println("It is not a month");
        } else if (monthNumber == 12 || monthNumber == 1 || monthNumber == 2) {
            System.out.println("Winter");
        } else if (monthNumber <= 5) {
            System.out.println("Spring");
        } else if (monthNumber <= 8) {
            System.out.println("Summer");
        } else {
            System.out.println("Autumn");
        }
    }

    public static void task14() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = sc.nextInt();
        if (number == 0 || number > 5) {
            System.out.println("It's not a mark");
        } else if (number == 1 || number == 2) {
            System.out.println("You got D");
        } else if (number == 3) {
            System.out.println("You got C");
        } else if (number == 4) {
            System.out.println("You got B");
        } else if (number == 5) {
            System.out.println("You got A, well done!");
        } else {
            System.out.println("Error");
        }
    }

    public static void task13() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (firstDigit > secondDigit && secondDigit > lastDigit) {
            System.out.println("Descending  number");
        } else {
            System.out.println("Not");
        }
    }

    public static void task12() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (firstDigit < secondDigit && secondDigit < lastDigit) {
            System.out.println("Rising number");
        } else {
            System.out.println("Not");
        }
    }

    public static void task11() {
        Scanner sc = new Scanner(System.in);
        int number, firstDigit, secondDigit, lastDigit;
        System.out.println("Enter a number");
        number = sc.nextInt();
        firstDigit = number / 100;
        secondDigit = number / 10 % 10;
        lastDigit = number % 10;
        if (firstDigit == secondDigit && secondDigit == lastDigit) {
            System.out.println("The number is flat");
        } else {
            System.out.println("The number is not flat");
        }
    }

    public static void task10() {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b) {
            if (a > c) {
                if (b > c) {
                    System.out.println("A is the highest number,C is the lowest number");
                } else if (c > b) {
                    System.out.println("A is the highest number,B is the lowest number");
                } else {
                    System.out.println("A is the highest number, B and C are equal");
                }
            } else if (a < c) {
                System.out.println("C is the highest number, B is the lowest");
            } else {
                System.out.println("A and C are equal B is the lowest number");
            }
        } else if (a < b) {
            if (a > c) {
                System.out.println("B is the highest, C is the lowest");
            } else if (a < c) {
                if (b > c) {
                    System.out.println("A is the lowest number, B is the highest");
                } else if (b < c) {
                    System.out.println("A is the lowest number, C is the highest number");
                } else {
                    System.out.println("B and C are the same,A is the lowest number");
                }
            } else {
                System.out.println("A and C are the same, B is the highest number");
            }
        } else {
            if (a > c) {
                System.out.println("A and B are the same, C is the lowest number");
            } else if (a < c) {
                System.out.println("C is the highest number, A and B are the same");
            } else {
                System.out.println("All three numbers are the same");
            }
        }
    }

    public static void task9() {
        //ax+b=0
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Enter 2 numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == 0 && b == 0) {
            System.out.println("Endless number of variations");
        }
        if (a == 0 && b != 0) {
            System.out.println("No solution to the equation");
        }
        if (a != 0) {
            System.out.println(a / -b);
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        int number, firstDigit, a, b, c, secondDigit, thirdDigit, fourthDigit, fifthDigit, lastDigit, sumOfFirstThreeNumbers, sumOfLastThreeNumbers;
        System.out.println("Enter a number");
        number = scanner.nextInt();
        firstDigit = number / 100000;
        a = number - firstDigit * 100000;
        secondDigit = a / 10000;
        b = a - secondDigit * 10000;
        thirdDigit = b / 1000;
        c = b - thirdDigit * 1000;
        fourthDigit = c / 100;
        fifthDigit = c / 10 % 10;
        lastDigit = c % 10;
        sumOfFirstThreeNumbers = firstDigit + secondDigit + thirdDigit;
        sumOfLastThreeNumbers = fourthDigit + fifthDigit + lastDigit;
        if (sumOfFirstThreeNumbers == sumOfLastThreeNumbers && sumOfFirstThreeNumbers % 2 == 0) {
            System.out.println("Lucky ticket");
        } else {
            System.out.println("Try again");
        }
    }

    public static void task7() {
        Scanner sc = new Scanner(System.in);
        int angle1, angle2, angle3;
        System.out.println("Enter two corners");
        angle1 = sc.nextInt();
        angle2 = sc.nextInt();
        angle3 = 180 - (angle1 + angle2);
        if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
            System.out.println("This is not a triangle");
        } else {
            if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
                System.out.println("acute - angled triangle");
            }
            if (angle1 > 90 && angle1 < 180 || angle2 > 90 && angle2 < 180 || angle3 > 90 && angle3 < 180) {
                System.out.println("obtuse triangle");
            }
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("right triangle");
            }
            if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("isosceles triangle");
            }
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("equilateral triangle");
            }
        }
    }


    public static void task6() {
        Scanner sc = new Scanner(System.in);
        int sideA, sideB, sideC;
        System.out.println("Enter 3 numbers");
        sideA = sc.nextInt();
        sideB = sc.nextInt();
        sideC = sc.nextInt();
        if (sideB + sideA > sideC && sideB + sideC > sideA && sideC + sideA > sideB) {
            System.out.println("This is a triangle");
        } else {
            System.out.println("This is not a triangle");
        }
    }

    public static void task5() {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.println("Enter the apartment number");
        number = sc.nextInt();
        if (number % 3 == 1) {
            System.out.println("Your apartment is at the left and is located on the " + number / 3 + " floor");
        } else if (number % 3 == 2) {
            System.out.println("Your apartment is in the middle and is located on the " + number / 3 + " floor");
        } else if (number % 3 == 0) {
            System.out.println("Your apartment is on the right and is located on the " + number / 3 + " floor");
        }
    }
}

