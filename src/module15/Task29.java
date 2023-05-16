package module15;

import java.util.Scanner;

public class Task29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum = 0;
        while (number >= 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            sum += lastDigit;
            number = numberWithoutLastDigit;
        }
        sum += number;
        System.out.println("The total sum of all digits is " + sum);
    }
}
