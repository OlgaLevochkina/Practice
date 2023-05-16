package module15;

import java.util.Scanner;

public class Task27a {
    public static final int MIN = 0;
    public static final int MAX = 9;

    public static void main(String[] args) {
        int count = 0, position = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int originalNumber = sc.nextInt();
        int digit = 4;
//        int digit = MIN + (int) ((MAX - MIN + 1) * Math.random());
        System.out.println("Your random digit is " + digit);
        while (originalNumber >= 10) {
            int number = originalNumber;
            int countOfDigits = 0;   // kolichestvo 0 posle pervoj cifri
            while (number >= 10) {
                number /= 10;
                countOfDigits++;
            }
            if (number == digit) {   //number = 1st digit in our number
                System.out.println(" The same number takes the " + position + " position");
                count++;
            }
            originalNumber = originalNumber - number * (int) Math.pow(10, countOfDigits);   //remove the 1st digit of the number
            position++;
        }
        if (originalNumber == digit) {
            System.out.println(position);
            count++;
        }
        System.out.println("Quantity - " + count);
    }
}
