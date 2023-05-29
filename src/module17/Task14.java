package module17;

import static module17.Reader.readInputNumber;

public class Task14 {
    public static void main(String[] args) {
        start(2);
    }

    public static void start(int countOfNumbers) {
        int totalSum = 0;
        for (int i = 0; i < countOfNumbers; i++) {
            int numberA = readInputNumber();
            totalSum += findSumOfDigits(numberA);
        }
        System.out.println(findAvr(totalSum, countOfNumbers));
    }

    private static int findSumOfDigits(int clientNumber) {
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

    private static double findAvr(int sum, int count) {
        return (double) sum / count;
    }
}
