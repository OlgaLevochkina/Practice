package module15;

import java.util.Scanner;

public class Task35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int originalNumber = sc.nextInt();
        int number = originalNumber;
        int count = 0;
        int newNumber = 0;
        while (number >= 10) {
            number /= 10;
            count++;
        }
        while (originalNumber >= 10) {
            int numberWithoutLastDigit = originalNumber / 10;
            int lastDigit = originalNumber - numberWithoutLastDigit * 10;
            newNumber = newNumber + lastDigit * (int) Math.pow(10, count);
            originalNumber = numberWithoutLastDigit;
            count--;
        }
        newNumber = newNumber + originalNumber;
        System.out.println(newNumber);
    }
}
