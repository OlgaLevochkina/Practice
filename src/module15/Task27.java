package module15;
//fignq
import java.util.Scanner;

public class Task27 {
    public static final int MIN = 1;
    public static final int MAX = 9;

    public static void main(String[] args) {
        int count = 0, position = 0, intermidiateValue;
        int countOfDigits = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int originalNumber = sc.nextInt();
        int digit = MIN + (int) ((MAX - MIN + 1) * Math.random());
        System.out.println("Your random digit is " + digit);

        int number = originalNumber;
        while (number >= 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            countOfDigits++;
            if (lastDigit == digit) {
                count++;
            }
            number = numberWithoutLastDigit;
            if (number == digit) {
                count++;
            }
        }
        countOfDigits++;
        System.out.println("The total number of digits is " + countOfDigits);
        int xaxa = (int) Math.pow(10, countOfDigits-1);
        int firstNumberPlace = originalNumber - number * xaxa;
//        System.out.println(xaxa);
        System.out.println("The position of the first digit is " + firstNumberPlace);
        System.out.println("Quantity - " + count);

//        while (originalNumber > 0) {
//            intermidiateValue = originalNumber % 10;
//            System.out.println("The digit at position " + count + " is " + intermidiateValue);
//            originalNumber = originalNumber / 10;
//            --count;
//        }
    }
}
