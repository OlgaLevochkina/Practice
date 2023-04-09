package module11;

import java.util.Scanner;

public class Task38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int x = sc.nextInt();
        int min = 100, max = 999;
        for (int i = 0; i < 15; i++) {
            int randomNumber = min + (int) ((max - min + 1) * Math.random());
            if (randomNumber % x == 0) {
                int firstDigit = randomNumber / 100;
                System.out.println(randomNumber + " " + (int) ((Math.sqrt(firstDigit) + 1)));
            } else {
                int secondDigit = randomNumber / 10 % 10;
                System.out.println((int) (Math.sqrt(secondDigit)) + " (" + randomNumber + ")");
            }
        }
    }
}
