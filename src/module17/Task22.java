package module17;

import static module17.Reader.readInputNumber;

public class Task22 {
    public static void main(String[] args) {
        int a = readInputNumber();
        int b = readInputNumber();
        int c = readInputNumber();
        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}
