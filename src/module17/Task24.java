package module17;

import static module17.Reader.readInputNumber;

public class Task24 {
    public static void main(String[] args) {
        int a = readInputNumber();
        int b = readInputNumber();
        int x = readInputNumber();
        int y = readInputNumber();
        System.out.println(checkIfPointLiesOnTheGraphOfTheFunction(a, b, x, y));
    }

    public static boolean checkIfPointLiesOnTheGraphOfTheFunction(int a, int b, int x, int y) {
        int temporaryNumber = a * x + b;
        return temporaryNumber == y;
    }
}
