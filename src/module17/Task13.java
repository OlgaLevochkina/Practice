package module17;

import static module17.Reader.readInputNumber;

public class Task13 {
    public static void main(String[] args) {
        int numberA = readInputNumber();
        int numberB = readInputNumber();
        int countOfDigitsNumberA = findQuantityOfDigits(numberA);
        int countOfDigitsNumberB = findQuantityOfDigits(numberB);
        System.out.println(compareQuantityOfDigits(countOfDigitsNumberB, countOfDigitsNumberA));
    }

    public static int findQuantityOfDigits(int clientNumber) {
        int countOfAllDigits = 0;
        while (clientNumber >= 10) {
            int numberA = clientNumber / 10;
            countOfAllDigits++;
            clientNumber = numberA;
        }
        countOfAllDigits++;
        return countOfAllDigits;
    }

    public static boolean compareQuantityOfDigits(int numberOne, int numberTwo) {   //ne ponqtno kak ono sokratilos avtomaticheski
        return numberOne == numberTwo;
    }
}
