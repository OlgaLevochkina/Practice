package module10;

import java.util.Scanner;

public class Practice10 {
    public static void main(String[] args) {
        task17();
    }

    public static void task21() {
        int down = -30, up = 30;
        int x = down + (int) ((up - down + 1) * Math.random());
        int y = down + (int) ((up - down + 1) * Math.random());
        System.out.println(x + "," + y);
        if (x > 0 && y > 0) {
            System.out.println("It is located in the 1st quarter");
        } else if (x > 0 && y < 0) {
            System.out.println("It is located in the 4th quarter");
        } else if (x < 0 && y < 0) {
            System.out.println("It is located in the 3rd quarter");
        } else if (x < 0 && y > 0) {
            System.out.println("It is located in the 2nd quarter");
        } else if (x == 0) {
            System.out.println("It is placed on the Y line");
        } else {
            System.out.println("It is placed on the X line");
        }
        if (x > y) {
            System.out.println("It is closer to Y line");
        } else {
            System.out.println("It is closer to X line");
        }
        double hypotenuse = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        System.out.println("The distance between the origin and the point is " + hypotenuse);
        System.out.println("The distance between the origin and the point is " + (int) hypotenuse);
    }

    public static void task20() {
        int down = 1, up = 9;
        int firstNumber = down + (int) ((up - down + 1) * Math.random());
        int downTwo = 100, upTwo = 999;
        int secondNumber = downTwo + (int) ((upTwo - downTwo + 1) * Math.random());
        int firstDigit = secondNumber / 100;
        int secondDigit = secondNumber / 10 % 10;
        int thirdDigit = secondNumber % 10;
        int maxDigit = Math.max(firstDigit, secondDigit);
        maxDigit = Math.max(maxDigit, thirdDigit);
        int difference = maxDigit - firstNumber;
        System.out.println(firstNumber + "," + secondNumber);
        System.out.println(difference);
    }

    public static void task19() {
        int down = -50, up = 50;
        int firstNumber = down + (int) ((up - down + 1) * Math.random());
        int secondNumber = down + (int) ((up - down + 1) * Math.random());
        int thirdNumber = down + (int) ((up - down + 1) * Math.random());
        int fourthNumber = down + (int) ((up - down + 1) * Math.random());
        int fifthNumber = down + (int) ((up - down + 1) * Math.random());
        int count = 0;
        if (firstNumber * secondNumber < 0) {
            count++;
        }
        if (secondNumber * thirdNumber < 0) {
            count++;
        }
        if (thirdNumber * fourthNumber < 0) {
            count++;
        }
        if (fourthNumber * fifthNumber < 0) {
            count++;
        }
        System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber + "," + fourthNumber + "," + fifthNumber);
        System.out.println(count);
    }

    public static void task18() {
        int down = 100, up = 999;
        int firstNumber = down + (int) ((up - down + 1) * Math.random());
        int secondNumber = down + (int) ((up - down + 1) * Math.random());
        int thirdNumber = down + (int) ((up - down + 1) * Math.random());
        System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber);
        int maxNumber = Math.max(firstNumber, secondNumber);
        maxNumber = Math.max(maxNumber, thirdNumber);
        int minNumber = Math.min(firstNumber, secondNumber);
        minNumber = Math.min(minNumber, thirdNumber);
        int difference = maxNumber - minNumber;
        System.out.println("The difference between the highest number and the smallest number is " + difference);
    }

    public static void task17() {
        double down = 1, up = 10.5;
        double firstCathet = down + ((up - down + 1) * Math.random());
        double secondCathet = down + ((up - down + 1) * Math.random());
        System.out.println(firstCathet + "," + secondCathet);
        double hypotenuse = Math.sqrt(Math.pow(firstCathet, 2) + Math.pow(secondCathet, 2));
        System.out.println(hypotenuse);
        double square = (firstCathet * secondCathet) / 2;
        double perimeter = firstCathet + secondCathet + hypotenuse;
        System.out.println("The square is " + square);
        System.out.println("The perimeter is " + perimeter);
        System.out.printf("The hypotenuse is %s, the square is %s and the perimeter is %s %n",   //== println no bez mnogo +
                (int) hypotenuse, (int) square, (int) perimeter);
    }

    public static void task16() {
        int down = 17, up = 94;
        int firstRandomNumber = down + (int) ((up - down + 1) * Math.random());
        int secondRandomNumber = down + (int) ((up - down + 1) * Math.random());
        System.out.println(firstRandomNumber + "," + secondRandomNumber);
        int maxNumber = Math.max(firstRandomNumber, secondRandomNumber);
        System.out.println("The bigger number is " + maxNumber);
        int firstDigitOfFirstNumber = firstRandomNumber / 10;
        int lastDigitOfFirstNumber = firstRandomNumber % 10;
        int firstDigitOfSecondNumber = secondRandomNumber / 10;
        int lastDigitOfSecondNumber = secondRandomNumber % 10;
        int minDigit = Math.min(firstDigitOfFirstNumber, lastDigitOfFirstNumber);
        minDigit = Math.min(minDigit, firstDigitOfSecondNumber);
        minDigit = Math.min(minDigit, lastDigitOfSecondNumber);
        System.out.println("The smallest digit is " + minDigit);
    }

    public static void task15() {
        int randomNumber, down = 250, up = 746;
        randomNumber = down + (int) ((up - down + 1) * Math.random());
        System.out.println(randomNumber);
        int firstDigit = randomNumber / 100;
        int secondDigit = randomNumber / 10 % 10;
        int thirdDigit = randomNumber % 10;
        int max = Math.max(firstDigit, secondDigit);
        max = Math.max(max, thirdDigit);
        System.out.println(max);
        int min = Math.min(firstDigit, secondDigit);
        min = Math.min(min, thirdDigit);
        System.out.println(min);
        if (firstDigit == secondDigit || secondDigit == thirdDigit || thirdDigit == firstDigit) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void task14() {
        int minNumber = 1, maxNumber = 9;
        int firstNumber = (minNumber + (int) ((maxNumber - minNumber + 1) * Math.random())) * 10;
        int secondNumber = (minNumber + (int) ((maxNumber - minNumber + 1) * Math.random())) * 10;
        int thirdNumber = (minNumber + (int) ((maxNumber - minNumber + 1) * Math.random())) * 10;
        int fourthNumber = (minNumber + (int) ((maxNumber - minNumber + 1) * Math.random())) * 10;
        int fifthNumber = (minNumber + (int) ((maxNumber - minNumber + 1) * Math.random())) * 10;
        System.out.println(firstNumber + "," + secondNumber + "," + thirdNumber + "," + fourthNumber + "," + fifthNumber);
    }

    public static void task13() {
        int minNumber = 1, maxNumber = 6;
        int firstPlayerVictory = 0, secondPlayerVictory = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Round " + i);
            int firstPlayer = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
            int secondPlayer = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
            System.out.println(firstPlayer + "," + secondPlayer);
            if (firstPlayer > secondPlayer) {
                System.out.println("First player won");
                firstPlayerVictory++;
            } else if (firstPlayer < secondPlayer) {
                System.out.println("Second player won");
                secondPlayerVictory++;
            } else {
                System.out.println("Drawn game");
            }
        }
        System.out.println("The first player won " + firstPlayerVictory + " times");
        System.out.println("The second player won " + secondPlayerVictory + " times");
        System.out.println("Drawn game = " + (10 - firstPlayerVictory - secondPlayerVictory));
    }


    public static void task12() {
        int minNumber = 2, maxNumber = 11;
        int firstRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int secondtRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int thirdRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int sum;
        System.out.println(firstRandomNumber + "," + secondtRandomNumber + "," + thirdRandomNumber);
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 if you would like to get another card");
        int clientNumber = sc.nextInt();
        if (clientNumber == 1) {
            int fourthRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
            sum = firstRandomNumber + secondtRandomNumber + thirdRandomNumber + fourthRandomNumber;
            System.out.println(fourthRandomNumber);
        } else {
            sum = firstRandomNumber + secondtRandomNumber + thirdRandomNumber;
        }
        System.out.println(sum);
        if (sum < 21) {
            System.out.println("Not enough");
        }
        if (sum > 21) {
            System.out.println("Too much");
        }
        if (sum == 21) {
            System.out.println("Bingo");
        }
    }

    public static void task11() {
        int minNumber = 2, maxNumber = 11;
        int firstRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int secondtRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int thirdRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int sum = firstRandomNumber + secondtRandomNumber + thirdRandomNumber;
        System.out.println(firstRandomNumber + "," + secondtRandomNumber + "," + thirdRandomNumber);
        System.out.println(sum);
        if (sum < 21) {
            System.out.println("Not enough");
        }
        if (sum > 21) {
            System.out.println("Too much");
        }
        if (sum == 21) {
            System.out.println("Bingo");
        }
    }

    //public static void task10() = task9()
    public static void task9() {
        int minNumber = Integer.MIN_VALUE + 11, maxNumber = Integer.MAX_VALUE - 11;
        int firstRandomNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        System.out.println(firstRandomNumber);
        int minNumberTwo = firstRandomNumber - 11, maxNumberTwo = firstRandomNumber + 11;
        int secondRandomNumber = minNumberTwo + (int) ((maxNumberTwo - minNumberTwo + 1) * Math.random());
        System.out.println(secondRandomNumber);
        if (firstRandomNumber == secondRandomNumber) {
            System.out.println("Good guess");
        }
        if (firstRandomNumber > secondRandomNumber) {
            System.out.println("Too small");
        }
        if (firstRandomNumber < secondRandomNumber) {
            System.out.println("Too big");
        }
    }

    public static void task8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int clientsNumber = scanner.nextInt();
        int minNumber = clientsNumber - 11, maxNumber = clientsNumber + 11;
        int range = maxNumber - minNumber + 1;
        int randomNumber = (int) (Math.random() * range) + minNumber;
        System.out.println(randomNumber);
        if (clientsNumber == randomNumber) {
            System.out.println("Lucky guess");
        }
        if (randomNumber > clientsNumber) {
            System.out.println("Too big");
        }
        if (randomNumber < clientsNumber) {
            System.out.println("Too small");
        }
    }

    public static void task7() {
        int minNumber = 10, maxNumber = 99;
        int firstNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int secondNumber = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        System.out.println(firstNumber + "," + secondNumber);
        if (firstNumber > secondNumber) {
            minNumber = secondNumber;
            maxNumber = firstNumber;
        } else {
            minNumber = firstNumber;
            maxNumber = secondNumber;
        }
        System.out.println("The range is between " + minNumber + " and " + maxNumber);
        int newNumberOne = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int newNumberTwo = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        int newNumberThree = minNumber + (int) ((maxNumber - minNumber + 1) * Math.random());
        System.out.println(newNumberOne + "," + newNumberTwo + "," + newNumberThree);
    }


    public static void task6() {
        int minNumber = 10, maxNumber = 99;
        int range = maxNumber - minNumber + 1;
        int initialRandomNumber = (int) (Math.random() * range) + minNumber;
        System.out.println(initialRandomNumber);
        int rangeTwo = maxNumber - initialRandomNumber + 1;
        int randomNumberOne = initialRandomNumber + (int) (Math.random() * rangeTwo);
        int randomNumberTwo = initialRandomNumber + (int) (Math.random() * rangeTwo);
        int randomNumberThree = initialRandomNumber + (int) (Math.random() * rangeTwo);
        System.out.println(randomNumberOne + " , " + randomNumberTwo + " , " + randomNumberThree);
    }

    public static void task5() {
        int minNumber = 10, maxNumber = 99;
        int range = maxNumber - minNumber + 1;
        int initialRandomNumber = (int) (Math.random() * range) + minNumber;
        System.out.println(initialRandomNumber);
        int randomNumber1 = (int) (Math.random() * initialRandomNumber) + minNumber;
        int randomNumber2 = (int) (Math.random() * initialRandomNumber) + minNumber;
        int randomNumber3 = (int) (Math.random() * initialRandomNumber) + minNumber;
        System.out.println(randomNumber1 + " , " + randomNumber2 + " , " + randomNumber3);
    }

    public static void task4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int minNumber = 0, maxNumber = number - 1;
        int range = maxNumber - minNumber + 1;
        int randomNumber1 = (int) (Math.random() * range) + minNumber;
        int randomNumber2 = (int) (Math.random() * range) + minNumber;
        int randomNumber3 = (int) (Math.random() * range) + minNumber;
        System.out.println(randomNumber1 + " , " + randomNumber2 + " , " + randomNumber3);
    }

    public static void task3() {
        int minNumber = -9, maxNumber = 9;
        int range = maxNumber - minNumber + 1;
        int randomNumber1 = (int) (Math.random() * range) + minNumber;
        int randomNumber2 = (int) (Math.random() * range) + minNumber;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        System.out.println("The higher number is " + Math.max(randomNumber1, randomNumber2));
        System.out.println("The lower number is " + Math.min(randomNumber1, randomNumber2));
    }

    public static void task2() {
        int minNumber = -9, maxNumber = 9;
        int range = maxNumber - minNumber + 1;
        int randomNumber1 = (int) (Math.random() * range) + minNumber;
        int randomNumber2 = (int) (Math.random() * range) + minNumber;
        System.out.println(randomNumber1);
        System.out.println(randomNumber2);

        System.out.println("The higher number is " + Math.max(randomNumber1, randomNumber2));
    }

    public static void task1() {
        int minNumber = 10, maxNumber = 99;
        int range = maxNumber - minNumber + 1;
        int randomNumber = (int) (Math.random() * range) + minNumber;
        System.out.println(randomNumber);
    }
}
