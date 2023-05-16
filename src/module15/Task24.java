package module15;

import java.util.Scanner;

public class Task24 {
    public static void main(String[] args) {
        int position = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int originalNumber = sc.nextInt();
        int number = originalNumber;
        while (originalNumber > 0) {
            originalNumber = originalNumber / 10;
            position++;
        }
        while (number > 0) {
            int lastDigit = number % 10;
            if (position % 2 == 0) {
                System.out.println("Even position is " + position + " and its digit is " + lastDigit);
            } else {
                System.out.println("Uneven position is " + position + " and its digit is " + lastDigit);
            }
            number = number / 10;
            position--;
        }
    }
}


