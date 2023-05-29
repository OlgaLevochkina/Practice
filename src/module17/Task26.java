package module17;

import static module17.Reader.readInputNumber;

public class Task26 {
    public static void main(String[] args) {
        findPrimaryNumber(readInputNumber());
    }

    public static void findPrimaryNumber(int number) {
        for (int i = 10; i < 100; i++) {
            boolean isPrime = checkIfPrime(i);
            if (isPrime && i + number < 100) {
                boolean isPrimeAdditionalNumber = checkIfPrime(i + number);
                if (isPrimeAdditionalNumber) {
                    System.out.println(i + " " + (i + number));
                }
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
