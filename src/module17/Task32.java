package module17;

import static module17.Reader.readInputNumber;

public class Task32 {
    public static void main(String[] args) {
        int numberX = readInputNumber();
        int digitD = readInputNumber();
        System.out.println(isThereADigitInTheNumber(numberX, digitD));
    }

    public static boolean isThereADigitInTheNumber(int number, int digit) {
        boolean isThere = false;
        while (number > 0 && !isThere) {
            isThere = number % 10 == digit;
            number /= 10;
        }
        return isThere;
    }
}
