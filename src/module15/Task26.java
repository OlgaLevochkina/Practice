package module15;

import java.util.Scanner;

public class Task26 {
    public static final int MIN = 1;
    public static final int MAX = 9;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number = sc.nextInt();
        int digit = MIN + (int) ((MAX - MIN + 1) * Math.random());
        System.out.println("Your random digit is " + digit);
        boolean isExist = false;
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            if (lastDigit == digit) {
                isExist = true;
                break;
            }
            number = numberWithoutLastDigit;
        }
        if (isExist || number == digit) {
            System.out.println("Yes");
        } else {
            System.out.println("Nope");
        }
    }
}
