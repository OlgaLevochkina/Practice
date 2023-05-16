package module15;

import java.util.Scanner;
//NE V ODNU STROCHKU

public class Task23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            number = numberWithoutLastDigit;
            if (lastDigit % 2 == 0) {
                System.out.println("The even number(s) are " + lastDigit + " ");
            } else {
                System.out.println(" The uneven number(s) are " + lastDigit + " ");
            }
        }
        if (number % 2 == 0) {
            System.out.println("The even number(s) are " + number + " ");
        } else {
            System.out.println(" The uneven number(s) are " + number + " ");
        }
    }
}
