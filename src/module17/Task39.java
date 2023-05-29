package module17;

import static module17.Reader.readInputNumber;

public class Task39 {
    public static void main(String[] args) {
        int x1 = readInputNumber();
        int y1 = readInputNumber();
        int x2 = readInputNumber();
        int y2 = readInputNumber();
        System.out.println(checkIfCross(x1, y1, x2, y2));
    }

    public static boolean checkIfCross(int x1, int y1, int x2, int y2) {
        return x1 * x2 < 0 || y1 * y2 < 0;
    }
}
