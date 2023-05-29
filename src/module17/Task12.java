package module17;

import static module17.Reader.readInputNumber;

public class Task12 {
    public static void main(String[] args) {
        System.out.println(findTheHighestDigit(readInputNumber()));
    }

    public static int findTheHighestDigit(int digit) {
        int maxNumber = digit % 10;
        while (digit > 0) {
            digit /= 10;
            if (digit % 10 > maxNumber) {
                maxNumber = digit % 10;
            }
        }

        return maxNumber;
    }
}
