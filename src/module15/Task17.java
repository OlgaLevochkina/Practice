package module15;

import java.util.Scanner;

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int biggerNumber = scanner.nextInt();
        int smallerNumber = scanner.nextInt();
        boolean isExist = false;
        while (biggerNumber > 10) {
            int numberWithoutLastDigit = biggerNumber / 10;
            int lastDigit = biggerNumber - numberWithoutLastDigit * 10;
            if (lastDigit == smallerNumber) {
                isExist = true;
            }
            biggerNumber = numberWithoutLastDigit;
        }
        if (isExist || biggerNumber == smallerNumber) {
            System.out.println("Yes");
        }
    }
}
