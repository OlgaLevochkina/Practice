package module17;

import static module17.Reader.readInputNumber;

public class Task28 {
    public static void main(String[] args) {
        int n = readInputNumber();
        if (n > 1) {
            for (int i = 2; i < n; i++) {
                findFactorial(i);
            }
        }
    }

    public static void findFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            System.out.println(n + " != " + result);
        }
    }
}
