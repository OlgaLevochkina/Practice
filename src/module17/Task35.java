package module17;

import static module17.Reader.readInputNumber;

public class Task35 {
    public static void main(String[] args) {
        int originalNumber = readInputNumber();
        System.out.println(checkIfPalindrome(originalNumber, reverseTheNumber(originalNumber)));
    }

    private static int reverseTheNumber(int originalNumber) {
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

        return newNumber;
    }

    public static boolean checkIfPalindrome(int originalNumber, int newNumber) {
        return originalNumber == newNumber;
    }
}
