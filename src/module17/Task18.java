package module17;

import static module17.Reader.readInputNumber;

public class Task18 {
    public static void main(String[] args) {
        int numberA = readInputNumber();
        int numberB = readInputNumber();
        System.out.println(swap(numberA, numberB));
        System.out.println(swap(numberB, numberA));
    }

    public static int swap(int numberA, int numberB) {
        int firstDigitA = findFirstDigit(numberA);
        int firstDigitB = findFirstDigit(numberB);

        return firstDigitB * 100 + numberA - firstDigitA * 100;
    }

    public static int findFirstDigit(int clientNumber) {
        return clientNumber / 100;
    }
}
