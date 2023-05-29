package module17;

import static module17.Reader.readInputNumber;

public class Task10 {
    public static void main(String[] args) {
        System.out.println("The total sum of all digits is " + findSumOfDigits(readInputNumber()));
    }

    public static int findSumOfDigits(int clientNumber) {
        int sumOfAllDigits = 0;
        while (clientNumber >= 10) {
            int numberWithoutLastDigit = clientNumber / 10;
            int lastDigit = clientNumber - numberWithoutLastDigit * 10;
            sumOfAllDigits += lastDigit;
            clientNumber = numberWithoutLastDigit;
        }
        sumOfAllDigits += clientNumber;

        return sumOfAllDigits;
    }
}
