package module17;

import static module17.Reader.readInputNumber;

public class Task23 {

    public static void main(String[] args) {
        int a = readInputNumber();
        int b = readInputNumber();
        int c = readInputNumber();
        solveQuadraticEquation(a, b, c);
    }

    public static void solveQuadraticEquation(int a, int b, int c) {
        int discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
//            double x1, x2;
//            x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
//            x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("2");
        } else if (discriminant == 0) {
//            double x;
//            x = -b / (2 * a);
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}

