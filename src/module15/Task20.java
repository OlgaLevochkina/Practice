package module15;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sum != 5) {
            System.out.println("Enter a number");
            int number = sc.nextInt();
            sum = 0;
            while (number > 10) {
                int numberWithoutLastDigit = number / 10;
                int lastDigit = number - numberWithoutLastDigit * 10;
                sum += lastDigit;
                number = numberWithoutLastDigit;
            }
            sum += number;
            System.out.println(sum + " ");
        }
    }
}
