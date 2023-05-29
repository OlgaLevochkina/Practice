package module17;

import static module17.Reader.readInputNumber;

public class Task25 {
    public static void main(String[] args) {
        findPrimaryNumber(readInputNumber());
    }

    public static void findPrimaryNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (checkIfPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkIfPrime(int number) {
        boolean isPrime = true;
        for (int j = 2; j * j <= number; j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
