package module17;

import static module17.Reader.readInputNumber;

public class Task11 {
    public static void main(String[] args) {
        System.out.println(findQuantityOfDigits(readInputNumber()));
    }

    public static int findQuantityOfDigits(int number) {
        int countOfAllDigits = 0;
        while (number >= 10) {
            int numberA = number / 10;
            countOfAllDigits++;
            number = numberA;
        }
        countOfAllDigits++;

        return countOfAllDigits;
    }
}
