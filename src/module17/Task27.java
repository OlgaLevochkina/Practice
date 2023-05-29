package module17;

import static module17.Reader.readInputNumber;

public class Task27 {
    public static void main(String[] args) {
        System.out.println(findFactorial(readInputNumber()));
    }

    public static int findFactorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        return result;
    }
}
