package module17;

import static module17.Reader.readInputNumber;

public class Task19 {
    public static void main(String[] args) {
        int numberA = readInputNumber();
        int numberB = readInputNumber();
        System.out.println(checkIfEqual(numberA, numberB));
    }

    public static int findLastDigit(int clientNumber) {
        return clientNumber % 10;
    }

    public static int findFirstDigit(int clientNumber) {
        while (clientNumber >= 10) {
            clientNumber /= 10;
        }

        return clientNumber;
    }

    public static boolean checkIfEqual(int numberA, int numberB) {
        return findFirstDigit(numberA) == findLastDigit(numberB);
    }
}
