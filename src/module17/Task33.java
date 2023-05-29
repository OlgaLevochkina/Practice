package module17;

import static module17.Reader.readInputNumber;

public class Task33 {
    public static void main(String[] args) {
        int numberX = readInputNumber();
        int digitD = readInputNumber();
        System.out.println(isThereADigitInTheNumber(numberX, digitD));
    }

    public static int isThereADigitInTheNumber(int number, int digit) {
        int count = 0;
        while (number > 10) {
            int numberWithoutLastDigit = number / 10;
            int lastDigit = number - numberWithoutLastDigit * 10;
            if (lastDigit == digit) {
                count++;
            }
            number = numberWithoutLastDigit;
        }
        if (number == digit) {
            count++;
        }

        return count;
    }
}
