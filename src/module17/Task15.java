package module17;


import static module17.Reader.readInputNumber;

public class Task15 {
    public static void main(String[] args) {
        int number = readInputNumber();
        System.out.println(isPrime(number));
    }

    public static boolean isPrime(int clientNumber) {
        if (clientNumber < 2) {
            return true;
        }
        for (int i = 2; i < clientNumber; i++) {
            if (clientNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}
