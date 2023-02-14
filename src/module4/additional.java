package module4;

import java.util.Scanner;

public class additional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter your number");
        number = scanner.nextInt();
        if (number / 10 == 0) {
            System.out.println("You entered the primary number");
        } else {
            int degree = 0, x;
            int result;
            do {
                x = number % 10;
                result = (int) (x * Math.pow(10, degree));
                degree++;
                System.out.println(result);
                number = number / 10;
            } while (number != 0);
            System.out.println("Your full number is " + number);
        }
    }
}
